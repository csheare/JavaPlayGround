/*
Notes:
Assume that we have the following declarations of function f and variables h1 and h2:

public static void f( RaceHorse r ) { ... }
Horse h1 = new RaceHorse();
Horse h2 = new Horse();
Now consider the following three calls to f:

f(h1); // compile-time error (missing cast)
f( (RaceHorse)h1 ); // fine! h1 really does point to a RaceHorse
f( (RaceHorse)h2 ); // runtime error (bad cast) h2 points to a Horse

Good: ((RaceHorse)h).WinRace();
Bad:(RaceHorse)h.WinRace(); // NO! This doesn't work!!

*/
public class Main{
  public static void main(String[] args){

    //Good
    Horse h1;
    RaceHorse r1 = new RaceHorse();
    h1 = r1;

    //Bad
    Horse h2 = new Horse();
    RaceHorse r2 = h3;

    //Examples setting Horse variable to point to RaceHorse Object
    Horse h3 = new RaceHorse();


    Horse x = new Horse();
    Horse y = new RaceHorse();
    Racehorse z = new RaceHorse()
    DoPrint(x);
    DoPrint(y);
    DoPrint(z);
  }
  public static void DoPrint( Horse h ) {
       h.Print();
   }
}

class Horse{
  private int myAge;
  private String myOwner;
  private double myValue;
  //constructors
  //Note: Like C++, Java also supports copy constructor. But, unlike C++, Java doesn’t create a default copy constructor if you don’t write your own.
  public Horse(){
    System.out.println("Horse No-Arg Constructor");
    myValue = 0;
  }
  public Horse(double d){
    System.out.println("Horse Conversion Constructor");
    myValue = d;
  }
  //lets do a copy constructor for giggles
  public Horse(Horse h){
    System.out.println("Horse Copy Constructor");
    myAge = h.myAge;
    myOwner = h.myOwner;
    myValue = h.myValue;
  }


  //methods
  public void Print() {System.out.println("Horse");}
  protected double getValue(){ return myValue;}
  protected void setValue(double d){ myValue = d;}
  public void Birthday(){ System.out.println("Horse Birthday"); }
  public void Sell(String newOwner){ System.out.println("The new owner of Horse is: " + newOwner);}

}

class RaceHorse extends Horse{
  private int myNumRacesWon;
  //constructors
  public RaceHorse(){
    this(2000.0);
    System.out.println("RaceHorse No-Arg Constructor");
  }

  public RaceHorse(double d){
    super(d);
    System.out.println("RaceHorse Conversion Constructor");
    myNumRacesWon = 0;
  }

  //methods
  public void Print() {System.out.println("RaceHorse");}
  public int RaceWon() {return myNumRacesWon;}

  public void WinRace(){
    myNumRacesWon++;
    setValue(1000.0);
  }

  public void Birthday(double d){ System.out.println("RaceHorse Birthday is :" + d);}
  public void Sell(String newOwner){ System.out.println("The new owner of RaceHorse is: " + newOwner);}
}

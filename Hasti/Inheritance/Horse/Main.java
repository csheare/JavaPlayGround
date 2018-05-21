


public class Main{
  public static void main(String[] args){
    /*RaceHorse rh1 = new RaceHorse();
    rh1.WinRace();
    rh1.Birthday();
    rh1.Birthday(10);
    rh1.Sell("Bob");

    //Constructor Play
    Horse h1 = new Horse();//Should call no args
    Horse h2 = new Horse(10);//should call Conversion
    Horse h3 = new Horse(h2);//should call Copy*/

    //Now lets try the RaceHorse
    RaceHorse rh2 = new RaceHorse();
    System.out.println(rh2.getValue());

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
  public int RaceWon() {return myNumRacesWon;}

  public void WinRace(){
    myNumRacesWon++;
    setValue(1000.0);
  }

  public void Birthday(double d){ System.out.println("RaceHorse Birthday is :" + d);}
  public void Sell(String newOwner){ System.out.println("The new owner of RaceHorse is: " + newOwner);}
}

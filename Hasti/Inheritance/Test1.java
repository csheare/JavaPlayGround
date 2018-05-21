class Test1{
  public static void main(String[] args){

  }
}

class Point{
  protected int x, y;

  //no-arg constructor
  public Point(){
    x = y =0;
  }

  //constructor with 2 args
  public Point(int a, int b){
    x=a;
    y=b;
  }


}

class ColorPoint extends Point{

  protected String color;

  //constructors

  public ColorPoint(){
    super();
    color = "red";
  }

  public ColorPoint(int a, int b){
    this(a,b,"red");
  }

  public ColorPoint(int a, int b, String c){
    super(a,b);
    color = c;
  }



}

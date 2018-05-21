public class Test2{

  public static void main(String[] args){
    Point p1 = new Point();
    p1.SetPoint(10, 20);
    Point p2 = p1.clone();
    p1.SetPoint(20, 30);
    System.out.println(p1);
    System.out.println(p2);
  }
}

class Point implements Cloneable {
    private int[] coords = new int[2];

    public String toString() {
        return "(" + coords[0] + ", " + coords[1] + ")";
    }

    public void SetPoint(int a, int b) {
	     coords[0] = a;
       coords[1] = b;
    }

    public Point clone(){
      try{
        Point tmp = (Point)super.clone();
        tmp.coords = (int[])coords.clone();
        return tmp;
      }catch(CloneNotSupportedException ex){
        //cannot get here:List implments Clonable, so do arrays
        throw new InternalError(ex.toString());
      }
    }
}

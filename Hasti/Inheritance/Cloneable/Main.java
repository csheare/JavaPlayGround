/*
Notes:

Every class extends Object. It is advised to the following methods when you define a new class:
  1.toString: returns a string rep of the object
  2.equals: returns true iff the object and ob are the same
  3.hashCode: returns an integer for this Object suitable to use as a hash code (for use with the Hashtable class)
  4.clone: return a copy of this object(Note: no constructor is called for the new object), this is a SHALLOW copy
    -If your class contains arrays or class member field variables, you should override this to perform a deep copy

    Summary of cloning: To permit your class objects to be cloned, you must:

    Make your class implement Cloneable.
    Redefine the clone method:
    make it public
    start with the call "super.clone()" inside a try block
    for every field of your object that is really a pointer, clone that field (in the same try block).

*/

import java.lang.*;

public class Main{

  public static void main(String[] args){
    List L1 = new List();
    //List L2 = L1.clone();
  }
}
//Cloneable is a useful marker interface, defined in java.lang
class List implements Cloneable{
  private Object items[];//a pointer field;
  final int maxItems = 10;

  public List(){
    items = new Object[10];
    for(var i : items){
      i = Integer.
    }
  }

  public Object clone(){
    try{
      List tmp = (List)super.clone();
      tmp.items = (Object[])items.clone();
      return tmp;
    }catch(CloneNotSupportedException ex){
      //cannot get here:List implments Clonable, so do arrays
      throw new InternalError(ex.toString());
    }
  }

}

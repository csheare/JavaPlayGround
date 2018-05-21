/*
Notes about Abstract Classes:

1.If a class includes an abstract method, the class must be declared abstract, too (otherwise you get a compile-time error).
2.An abstract class cannot be instantiated:
3. A subclass of an abstract class that does not provide bodies for all abstract methods must also be declared abstract:
  - class Statement extends Node { // Error!  Statement does not
       }                              // implement Print, so it must
                                      // be an abstract class
4. A subclass of a non-abstract class can override a (non-abstract)method of its superclass,
   and declare it abstract. In that case, the subclass must be declared abstract.


*/



public class Main{
  public static void main(String[] args){

    Node n;//This is Ok, not an object, just a pointer
    n = new Condition();//also OK
    //n = new Node();//Error!

    Condition c = new Condition();
    c.Print();

  }
}


/*
Here's a reasonable class hierarchy for flowchart nodes:
         Node
       /      \
   Statement  Condition
  /    |   \
Assign Read Write

*/
abstract class Node{
  abstract public void Print();
}

class Condition extends Node{
  public void Print(){
    System.out.println("Printing Condition!! :DD");
  }
}

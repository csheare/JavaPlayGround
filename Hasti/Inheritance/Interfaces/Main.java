//no multiple inheritance in Java, interfaces instead!
//only contain public, static, final fields
// public, abstract methods
//A class can implement one or more interfaces (in addition to extending one class).
  //It must provide bodies for all of the methods declared in the interface, or else it must be abstract. For example:
//Public interfaces (like public classes) must be in a file with the same name.
//Many classes can implement the same interface (e.g., both the TA class and the Staff class can implement the Employee interface).
// An interface can be a "marker":
//-no fields or methods
//-used only to "mark" a class as having a property
//-testable via the instanceof operator




public class Main{

  public static void main(String[] args){

  }

}

public interface Employee{
  void raiseSalary(double d);
  double getSalary();
}

public class TA implements Employee {
    void RaiseSalary( double d ) {
        // actual code here
    }
    double GetSalary() {
        // actual code here
    }
}

/*
For example:
    interface GoodClass { }
    class C1 implements GoodClass { ... }
    ...
    C1 x = new C1();
    if (x instanceof GoodClass) ...  // this condition evaluates to true
*/    

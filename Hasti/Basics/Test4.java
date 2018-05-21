/*

This class will go over class issues in java, due to the fact that classes and arrays are really pointers.

*/

import java.util.Arrays;

class Test4{
  public static void main(String[] args){

    //Problem 1: Simple Aliasong with Arrays

    int[] A = new int[3];
    int[] B  = new int[2];
    A[0] = 5;
    System.out.println("A is: " + Arrays.toString(A));
    System.out.println("B is: " + Arrays.toString(B));
    B = A;
    System.out.println("A is: " + Arrays.toString(A));
    System.out.println("B is: " + Arrays.toString(B));
    B[0] = 2;
    System.out.println("A is: " + Arrays.toString(A));
    System.out.println("B is: " + Arrays.toString(B));


    //Problem 2: Pass by value vs pass by Reference
    //In java all parameters are pass by value, but for arrays and classes, the actual paramter is really a pointer, so changing
    // an array or a class field inside the functio does change the actual parameter's element or field

    /*
    THIS WILL NOT WORK, THIS AINT C++
    int x = 5;
    increment(&x);
    System.out.println(x);
    */

    int[] B = new int[3];
    B[0] = 5;
    f(B);
    // B is not null here, because B itself was passed by value
    // however B[0] is now 10, because function f changed the first element of the array


  }

  static void increment(int x){
    x++;
  }

  void static f(int[] A){
    A[0] = 10;//change an element of paramater A
    A = null;//change A itself
  }
}

// int A[5];
//        Compile-time error: Can't specify array dimension in a declaration.
//        This is C/C++ syntax.
//
//    int [] A, B;
//    B = 0;
//        Compile-time error: Incompatible type for =. Can't convert int to
//        int[].  B is an array reference, not an int, and 0 is not equiv to
//        null as in C/C++.
//
//    int [] A = {1,2,3};
//    int [] B;
//    B = A;
//        No errors.
//
//    int [] A;
//    A[0] = 0;
//        Compile-time error: Variable A may not have been initialized.
//        The array was never allocated.
//
//    int [] A = new int[20];
//    int [] B = new int[10];
//    A = B;
//    A[15] = 0;
//        Runtime error: ArrayIndexOutOfBoundsException: 15
//        A now references the same array as B, which only has length 10

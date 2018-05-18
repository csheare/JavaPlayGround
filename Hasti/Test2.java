/*

Write a complete Java program that uses a loop to sum the numbers from 1 to 10 and prints the result like this:

    The sum is: xxx

Note: Use variable declarations, and a for or while loop with the same syntax as in C++.
Make sure that you are able to compile and execute your program

*/


public class Test2{
   public static void main(String[] args){
     System.out.println("The sum is: " + sumRange(1,10));
   }

   static int sumRange(int lowerBound, int upperBound){
     int sum = 0;
     for(int i = lowerBound; i <= upperBound; i++){
       sum+=i;
     }
     return sum;
   }
 }

class Test1{
    public static void main(String[] args){
      System.out.println("The sum is: " + sumRange(5,10));
    }

    static int sumRange(int lowerBound, int upperBound){
      int sum = 0;
      for(int i = lowerBound; i <= upperBound; i++){
        sum+=i;
      }
      return sum;
    }
  }

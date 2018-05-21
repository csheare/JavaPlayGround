/*
TEST YOURSELF #3
Write a Java function called NonZeros, using the header given below. NonZeros should create and return an array of integers containing all of the non-zero values in its parameter A, in the same order that they occur in A.

    public static int[] NonZeros( int [] A )
Write a complete Java program that includes a main function as well as the NonZeros function. The main function should
 test NonZeros by creating several arrays, and calling NonZeros with each array. It should print the array it passes
  to NonZeros as well as the returned array. So for example, when you run your program,
  your output might look like this (if your NonZeros function is implemented correctly):

    passing [0,1,2,3,2] got back [1,2,3,2]
    passing [0,0] got back []
    passing [22,0,-5,0,126] got back [22,-5,126]
    passing [1,0] got back [1]

*/
import java.util.ArrayList;
import java.util.Arrays;

class Test3{
  public static void main(String[] args){

    ArrayList<int[]> arrays = new ArrayList<int[]>();
    arrays.add(new int[] {0,1,2,3,2});
    arrays.add(new int[]{0,0});
    arrays.add(new int[]{22,0,-5,0,126});
    arrays.add(new int[]{1,0});

    for(int[] i : arrays){
      System.out.println("passing " + Arrays.toString(i) + " got back "+ Arrays.toString(NonZeros(i)));
    }
  }

  public static int[] NonZeros(int[] A){

    int nonzeros =0;
    for(int i : A) if(i!=0) nonzeros++;

    int[] arr = new int[nonzeros];
    int index = 0;

    for(int i : A){
      if(i != 0){
        arr[index] = i;
        index++;
      }
    }

    return arr;
  }
}

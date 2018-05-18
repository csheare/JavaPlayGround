/*

Just a place to experiement with Arrays yo

*/

class Arrays{

  public static void main(String[] args){

    //int A[]; this wont work, not initilaized
    int [] A;//A is a pointer to an array, still no size
    A = new int[1000];//now we initilize the crap out of A
    //Array elements are initilized to 0
    System.out.println(A.length);//1000
    System.out.println(A[0]);//0

    int[] B = {1,222,0};
    System.out.println(B.length);//1000
    for(int i : B){
      System.out.print(i + " ");//1,222,0
    }
  }
}

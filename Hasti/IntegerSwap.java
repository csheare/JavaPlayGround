/*

Playing with Integer wrappers :)

You cannot change the Integer since they are pass by value only, and this immutable

*/

class IntegerSwap{

  public static void main(String[] args){

    Integer n = Integer.valueOf(5), m =  Integer.valueOf(6);
    Swap2(n, m);
    System.out.println("n = " + n + "; m = " + m);



  }
  static void Swap1(Integer j, Integer k){
    int tmp = k.intValue();
    k = Integer.valueOf(j.intValue());
    j = Integer.valueOf(tmp);
  }
}

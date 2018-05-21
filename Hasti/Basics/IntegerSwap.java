/*

Playing with Integer wrappers :)

You cannot change the Integer since they are pass by value only, and this immutable

*/

import java.util.ArrayList;


class IntegerSwap{

  public static void main(String[] args){

    Integer n = Integer.valueOf(5), m =  Integer.valueOf(6);
    Swap1(n, m);
    System.out.println("n = " + n + "; m = " + m);

    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(Integer.valueOf(5));
    list.add(Integer.valueOf(4));
    list.add(Integer.valueOf(6));
    list.add(Integer.valueOf(7));

    for( var i : list){
      System.out.println(i);
    }



  }
  static void Swap1(Integer j, Integer k){
    int tmp = k.intValue();
    k = Integer.valueOf(j.intValue());
    j = Integer.valueOf(tmp);
  }
}

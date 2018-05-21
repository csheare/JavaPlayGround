/*

Just Reversing Strings on a Friday Afternoon
Just ate some Wasabi Peas too!

*/


class Reverse{

  public static void main(String[] args){
    String h = "hello";
    System.out.println("The String is: " + h + " and it Reversed is: " + reverse(h));
  }
  static String reverse(String S) {
    String newS = "";
    for(int i = S.length()-1;i>= 0;i--){
      newS += S.charAt(i);
    }
    return newS;
  }
}

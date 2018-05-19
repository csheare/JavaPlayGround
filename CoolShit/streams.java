/*

Well, I didn't know this existed!

Following: http://winterbe.com/posts/2014/07/31/java8-stream-tutorial-examples/

*/

import java.util.*;

class Streams{

  public static void main(String[] args){

    List<String> myList =
    Arrays.asList("a1", "a2", "b1", "c2", "c1");

    myList
    .stream()
    .filter(s -> s.startsWith("c"))
    .map(String::toUpperCase)
    .sorted()
    .forEach(System.out::println);
  }
  //System.out.println(myList);
}

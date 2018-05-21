/*

Just a class to demonstart some basic class structure of Java and how wrapper classes work for primitives

*/

class List{
  //fields
  private Object [] items;
  private int numItems;

  //methods
    //construction function
    public List()
    {
      items =  new Object[10];
      numitems = 0;
    }

    public void AddToEnd(Object ob){
      if(numItems < 10){
          items[numItems] = ob;
          numItems++;
      }else{
        throw "Yo,the List is Full!"
      }
    }

  public static void main(string[] args){
      List L = new List();
      //L.AddToEnd(10); won't WORK
      L.AddToEnd(Integer.valueOf(5));

      //Getting Items from the List is tricky too!

      //Integer K = L.nextElement(); this will not work because nextElement returns an Object. not an Integer
      Integer K = (Integer)L.nextElement();

      //To get back a primitive
      int i = K.intValue();
  }

}

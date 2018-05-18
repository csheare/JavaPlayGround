/*

Here we explore type conversions, both implicit and explicit

*/

class TypeConversions{

  public static void main(String[] args){
    //An implicit conversion means that a value of one type is
    //changed to a value of another if the range of values of the
    // first type is a subset of the range of values of the second type.

    char c = 'a';
    int k = c;
    long x = c;
    float y = c;
    double d = c;

    //An explicit conversion is done via casting.
    double d = 5.6;
    int k = (int)d;
    short s = (short) (d*2.0);

    //casting can be used to convert between any of the primitive types except boolean
    //casting can lose information
    

  }
}

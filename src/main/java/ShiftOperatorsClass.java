/**
 * Start with a number that is all binary ones. Left shift it, then use the
 * unsigned right-shift operator to right shift through all of its binary positions, each time
 * displaying the result using Integer.toBinaryString( ).
 */

public class ShiftOperatorsClass {
    int a = 0b1111;
    int lvalue = a << 2;
    int rvalue = lvalue >>> 1;
    int rvalue1 = rvalue >>> 1;
    int rvalue2 = rvalue1 >>> 1;
    int rvalue3 = rvalue2 >>> 1;
    int rvalue4 = rvalue3 >>> 1;
    int rvalue5 = rvalue4 >>> 1;
}

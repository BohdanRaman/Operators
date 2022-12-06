package task_12;

/**
 * Start with a number that is all binary ones. Left shift it, then use the
 * unsigned right-shift operator to right shift through all of its binary positions, each time
 * displaying the result using Integer.toBinaryString( ).
 */

public class ShiftOperatorsClass {
    private int a = 0b1111;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

  public int lvalue = a << 2;
  public int rvalue = lvalue >>> 1;
  public int rvalue1 = rvalue >>> 1;
  public int rvalue2 = rvalue1 >>> 1;
  public int rvalue3 = rvalue2 >>> 1;
  public int rvalue4 = rvalue3 >>> 1;
  public int rvalue5 = rvalue4 >>> 1;
}

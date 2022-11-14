/**
 * Write a program with two constant values, one with alternating binary
 * ones and zeroes, with a zero in the least-significant digit, and the second, also alternating,
 * with a one in the least-significant digit (hint: It’s easiest to use hexadecimal constants for
 * this). Take these two values and combine them in all possible ways using the bitwise
 * operators, and display the results using Integer.toBinaryString( ).
 */

public class BitwiseOperatorsClassExercise10 {

    private  int n = 0b010101;
    private  int k = 0b101010;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public int resultOperatorsAnd(int n, int k) {
        return n & k;
    }

    public int resultOperatorsOr(int n, int k) {
        return n | k;
    }

    public int resultOperatorsExclusive(int n, int k) {
        return n ^ k;
    }

    public int resultOperatorsNot(int n) {
        return ~n;
    }

    public int resultOperatorsNotOther(int k) {
        return ~k;
    }

    public int resultOperatorsRightShift(int n) {
        return n >> 2;
    }

    public int resultOperatorsLeftShift(int k) {
        return k << 4;
    }

    public int resultOperatorsUnsignedLeftShift(int k) {
        return k >>> 3;
    }
}
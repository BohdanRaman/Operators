/**
 * Write a program with two constant values, one with alternating binary
 * ones and zeroes, with a zero in the least-significant digit, and the second, also alternating,
 * with a one in the least-significant digit (hint: It’s easiest to use hexadecimal constants for
 * this). Take these two values and combine them in all possible ways using the bitwise
 * operators, and display the results using Integer.toBinaryString( ).
 */

public class BitwiseOperatorsClass {

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
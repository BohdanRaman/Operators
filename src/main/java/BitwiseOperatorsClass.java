/**
 * Write a program with two constant values, one with alternating binary
 * ones and zeroes, with a zero in the least-significant digit, and the second, also alternating,
 * with a one in the least-significant digit (hint: It’s easiest to use hexadecimal constants for
 * this). Take these two values and combine them in all possible ways using the bitwise
 * operators, and display the results using Integer.toBinaryString( ).
 */

public class BitwiseOperatorsClass {

    int n = 010101010101;
    int k = 1010101010;
    int a = n & k;
    int v = n | k;
    int m = n ^ k;
    int e = ~n;
    int f = ~k;
    int g = n >> 2;
    int l = k << 4;
    int h = k >>> 3;
}

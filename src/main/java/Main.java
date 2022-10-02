/**
 * @author Raman Bohdan
 * @version 1.0
 * @since 26.09.2022
 */
public class Main {
    public static void main(String[] args) {
        /* Task 5 and task 6 */
        Dog doberman = new Dog("Spot", "Ruff!");
        Dog colly = new Dog("Scruffy", "Wurf!");
        Dog taxa = new Dog("Spot", "Rrrrr");

        System.out.println("Task 5 and task 6");
        System.out.println("Name doberman: " + doberman.getName() + ", " + "doberman says: " + doberman.getSays());
        System.out.println("Name colly: " + colly.getName() + ", " + "colly says: " + colly.getSays());
        System.out.println(doberman == colly);
        System.out.println(doberman != colly);
        System.out.println(doberman == taxa);
        System.out.println(doberman != taxa);
        System.out.println(colly == taxa);
        System.out.println(colly != taxa);
        System.out.println(doberman.equals(colly));
        System.out.println(doberman.equals(taxa));
        System.out.println(colly.equals(taxa) + "\n");

        /* Task 8 */
        System.out.println("Task 8");
        HexAndOctalNotations notations = new HexAndOctalNotations(0xABC, 026);

        System.out.println("int i hex: " + Long.toBinaryString(notations.a));
        System.out.println("int b octal: " + Long.toBinaryString(notations.b) + "\n");

        /* Task 10.
         *I don't create hexadecimal constants in this task, that a hexadecimal number starts with zero*/
        System.out.println("Task 10");
        BitwiseOperatorsClass bitwiseOperators = new BitwiseOperatorsClass();

        System.out.println("n = " + Integer.toBinaryString(bitwiseOperators.n));
        System.out.println("k = " + Integer.toBinaryString(bitwiseOperators.k));
        System.out.println("a = " + Integer.toBinaryString(bitwiseOperators.a));
        System.out.println("v = " + Integer.toBinaryString(bitwiseOperators.v));
        System.out.println("m = " + Integer.toBinaryString(bitwiseOperators.m));
        System.out.println("e = " + Integer.toBinaryString(bitwiseOperators.e));
        System.out.println("f = " + Integer.toBinaryString(bitwiseOperators.f));
        System.out.println("g = " + Integer.toBinaryString(bitwiseOperators.g));
        System.out.println("l = " + Integer.toBinaryString(bitwiseOperators.l));
        System.out.println("h = " + Integer.toBinaryString(bitwiseOperators.h));

        /*"Task 12"*/
        System.out.println("Task 12");
        ShiftOperatorsClass shiftOperators = new ShiftOperatorsClass();

        System.out.println(Integer.toBinaryString(shiftOperators.a));
        System.out.println(Integer.toBinaryString(shiftOperators.lvalue));
        System.out.println(Integer.toBinaryString(shiftOperators.rvalue));
        System.out.println(Integer.toBinaryString(shiftOperators.rvalue1));
        System.out.println(Integer.toBinaryString(shiftOperators.rvalue2));
        System.out.println(Integer.toBinaryString(shiftOperators.rvalue3));
        System.out.println(Integer.toBinaryString(shiftOperators.rvalue4));
        System.out.println(Integer.toBinaryString(shiftOperators.rvalue5) + "\n");

        /*Task 14*/
        System.out.println("Task 14");
        EqualsStringClass eq = new EqualsStringClass();
        eq.equalsTwoString("Cat", "Dog");

        EqualsStringClass eq1 = new EqualsStringClass();
        eq1.equalsTwoString("Cat", "Dog");

        System.out.println(eq==eq1);
        System.out.println(eq!=eq1);
        System.out.println(eq.equals(eq1));

    }
}

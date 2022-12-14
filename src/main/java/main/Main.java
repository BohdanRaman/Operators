package main;

import task_10.BitwiseOperatorsClass;
import task_12.ShiftOperatorsClass;
import task_14.EqualsStringClass;
import task_5.Dog;
import task_8.HexAndOctalNotations;

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
        System.out.println("int i hex: " + Long.toBinaryString(notations.getHex()));
        System.out.println("int b octal: " + Long.toBinaryString(notations.getOctal()) + "\n");

        /*Task 10*/
        System.out.println("Task 10");
        BitwiseOperatorsClass bitwiseOperators = new BitwiseOperatorsClass();
        System.out.println("bitwise operators AND = " + Integer.toBinaryString(bitwiseOperators.resultOperatorsAnd(bitwiseOperators.getN(), bitwiseOperators.getK())));
        System.out.println("bitwise operators OR = " + Integer.toBinaryString(bitwiseOperators.resultOperatorsOr(bitwiseOperators.getN(), bitwiseOperators.getK())));
        System.out.println("bitwise operators XOR = " + Integer.toBinaryString(bitwiseOperators.resultOperatorsExclusive(bitwiseOperators.getN(), bitwiseOperators.getK())));
        System.out.println("bitwise operators NOT = " + Integer.toBinaryString(bitwiseOperators.resultOperatorsNot(bitwiseOperators.getN())));
        System.out.println("bitwise operators not = " + Integer.toBinaryString(bitwiseOperators.resultOperatorsNotOther(bitwiseOperators.getK())));
        System.out.println("bitwise operators left-shift = " + Integer.toBinaryString(bitwiseOperators.resultOperatorsLeftShift(bitwiseOperators.getK())));
        System.out.println("bitwise operators right-shift = " + Integer.toBinaryString(bitwiseOperators.resultOperatorsRightShift(bitwiseOperators.getN())));
        System.out.println("bitwise operators unsigned left-shift = " + Integer.toBinaryString(bitwiseOperators.resultOperatorsUnsignedLeftShift(bitwiseOperators.getK())) + "\n");

        /*Task 12*/
        System.out.println("Task 12");
        ShiftOperatorsClass shiftOperators = new ShiftOperatorsClass();
        System.out.println(Integer.toBinaryString(shiftOperators.getA()));
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
        System.out.println(eq.equalsTwoString("Cat", "Cat"));
        System.out.println(eq.equalsTwoString("CAT", "DOG"));

    }
}

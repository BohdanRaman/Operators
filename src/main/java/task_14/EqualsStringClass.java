package task_14;

/**
 * Write a method that takes two String arguments and uses all the
 * boolean comparisons to compare the two Strings and print the results. For the == and !=,
 * also perform the equals( ) test. In main( ), call your method with some different String
 * objects.
 */

public class EqualsStringClass {
    public boolean equalsTwoString(String str1, String str2) {

        /* 1. The special method equals( ) that exists for all objects.
           2.  == and != for primitives. */
        if (str1 == null && str2 == null) {
            return true;
        }
        if (str1 != null && str1.equals(str2)) {
            return true;
        }
        if (str1 == str2) {
            return true;
        }
        if (str1 != str2) {
            return false;
        }
        return true;
    }
}
/* If I put null in argument, then compiler swears */


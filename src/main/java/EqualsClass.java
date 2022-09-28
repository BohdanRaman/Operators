public class EqualsClass {
    public void getValue(String value1, String value2) {
        if (value1.equals(value2)) {
            System.out.println("Statement  is true");
        } else {
            System.out.println("Statement is false");
        }
        if (value1 == value2) {
            System.out.println("Statement  is true");
        } else {
            System.out.println("Statement is false");
        }
    }
}


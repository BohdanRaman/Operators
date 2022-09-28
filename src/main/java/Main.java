import static java.sql.DriverManager.println;

public class Main {
    public static void main(String[] args) {
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

        System.out.println("Task 8");
        int i = 0x9F;
        int b = 0x7;

        System.out.println("int i: " + Long.toBinaryString(i));
        System.out.println("int b: " + Long.toBinaryString(b) + "\n");

        System.out.println("Task 12");
        int c = 11;
        System.out.println(Integer.toBinaryString(c));
        c = c << 1;
        System.out.println(Integer.toBinaryString(c));
        c = c >>> 3;
        System.out.println(Integer.toBinaryString(c) + "\n");

        System.out.println("Task 14");
        EqualsClass equalsClass = new EqualsClass();
        equalsClass.getValue("100", "100");
        equalsClass.getValue("Cat", "Dog");
        System.out.println(equalsClass.equals(equalsClass) + "\n");

        /* I don't create hexadecimal constants in this task, that a hexadecimal number starts with zero*/
        System.out.println("Task 10");
        int n = 010101010101;
        int k = 1010101010;
        int a = n & k;
        int v = n | k;
        int m = n ^ k;
        int e = ~n;
        int f = ~k;
        int g = n>>2;
        int l = k<<4;
        int h = k>>>3;

        System.out.println("n = " + Integer.toBinaryString(n));
        System.out.println("k = " + Integer.toBinaryString(k));
        System.out.println("a = " + Integer.toBinaryString(a));
        System.out.println("v = " + Integer.toBinaryString(v));
        System.out.println("m = " + Integer.toBinaryString(m));
        System.out.println("e = " + Integer.toBinaryString(e));
        System.out.println("f = " + Integer.toBinaryString(f));
        System.out.println("g = " + Integer.toBinaryString(g));
        System.out.println("l = " + Integer.toBinaryString(l));
        System.out.println("h = " + Integer.toBinaryString(h));
    }
}

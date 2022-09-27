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

        /// TODO
        System.out.println("Task 14");
        EqualsClass equalsClass = new EqualsClass();
        System.out.println(equalsClass.getValue("100", "100"));
        System.out.println(equalsClass.getValue("Cat", "Dog") + "\n");

        System.out.println("Task 10...");

    }
}

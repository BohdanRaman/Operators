package task_5; /**
 * Exercise 5: (2) Create a class called Dog containing two Strings: name and says. In
 * main( ), create two dog objects with names “spot” (who says, “Ruff!”) and “scruffy” (who
 * says, “Wurf!”). Then display their names and what they say.
 * <p>
 * Exercise 6: (3) Following Exercise 5, create a new Dog reference and assign it to spot’s
 * object. Test for comparison using == and equals( ) for all references.
 */

public class Dog {
    private String name;
    private String says;

    public Dog(String name, String says) {
        this.name = name;
        this.says = says;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSays() {
        return says;
    }

    public void setSays(String says) {
        this.says = says;
    }
}

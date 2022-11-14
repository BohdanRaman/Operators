/**
 * Exercise 5: (2) Create a class called Dog containing two Strings: name and says. In
 * main( ), create two dog objects with names “spot” (who says, “Ruff!”) and “scruffy” (who
 * says, “Wurf!”). Then display their names and what they say.
 * <p>
 * Exercise 6: (3) Following Exercise 5, create a new Dog reference and assign it to spot’s
 * object. Test for comparison using == and equals( ) for all references.
 */

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DogExercise5 {
    private String name;
    private String says;

}

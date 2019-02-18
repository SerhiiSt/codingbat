package string_1;

/**
 * Created by Sergio on 2/18/19.
 */

/**
 * Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
 *
 helloName("Bob") → "Hello Bob!"
 helloName("Alice") → "Hello Alice!"
 helloName("X") → "Hello X!"
 */
public class HelloName {

    public String helloName(String name) {
        String text = "Hello";
        return text + " " + name + "!";
    }

}

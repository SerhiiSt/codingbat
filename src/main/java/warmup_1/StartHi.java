package warmup_1;

/**
 * Created by Sergio on 2/18/19.
 */

/**
 * Given a string, return true if the string starts with "hi" and false otherwise.

 startHi("hi there") → true
 startHi("hi") → true
 startHi("hello hi") → false
 */
public class StartHi {

    public boolean startHi(String str) {
        if (str.length() > 1 && str.startsWith("hi")) {
            return true;
        } else return false;
    }

}

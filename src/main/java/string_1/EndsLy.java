package string_1;

/**
 * Created by Sergio on 2/19/19.
 */

/**
 * Given a string, return true if it ends in "ly".

 endsLy("oddly") → true
 endsLy("y") → false
 endsLy("oddy") → false
 */
public class EndsLy {

    public boolean endsLy(String str) {
        if (str.endsWith("ly")) {
            return true;
        }
        return false;
    }

}

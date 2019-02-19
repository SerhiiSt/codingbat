package string_1;

/**
 * Created by Sergio on 2/19/19.
 */

/**
 * Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".

 frontAgain("edited") → true
 frontAgain("edit") → false
 frontAgain("ed") → true
 */
public class FrontAgain {

    public boolean frontAgain(String str) {
        if (str.length() < 2) {
            return false;
        }
        String start = str.substring(0, 2);
        String end = str.substring(str.length() - 2, str.length());
        if (start.equals(end)) {
            return true;
        }


        return false;
    }

}

package string_1;

/**
 * Created by Sergio on 2/19/19.
 */

/**
 * Given a string, if the string begins with "red" or "blue" return that color string,
 * otherwise return the empty string.

 seeColor("redxx") → "red"
 seeColor("xxred") → ""
 seeColor("blueTimes") → "blue"
 */
public class SeeColor {

    public String seeColor(String str) {
        if (str.startsWith("red", 0)) {
            return "red";
        }
        if (str.startsWith("blue", 0)) {
            return "blue";
        }
        return "";
    }

}

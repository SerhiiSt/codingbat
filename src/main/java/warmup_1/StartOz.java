package warmup_1;

/**
 * Created by Sergio on 2/18/19.
 */

/**
 *
 */
public class StartOz {

    public String startOz(String str) {
        if (str.equals("")) {
            return "";
        }
        if (str.length() <= 1) {
            if (str.charAt(0) == 'o') {
                return "o";
            } else if (str.charAt(1) == 'z') {
                return "z";
            }
            return "";
        }
        if (str.charAt(0) == 'o' && str.charAt(1) == 'z') {
            return "oz";
        }
        if (str.charAt(0) == 'o') {
            return "o";
        }
        if (str.charAt(1) == 'z') {
            return "z";
        }
        return "";
    }

}

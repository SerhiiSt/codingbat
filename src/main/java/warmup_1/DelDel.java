package warmup_1;

/**
 * Created by Sergio on 2/18/19.
 */

/**
 * Given a string, if the string "del" appears starting at index 1,
 * return a string where that "del" has been deleted. Otherwise, return the string unchanged.

 delDel("adelbc") → "abc"
 delDel("adelHello") → "aHello"
 delDel("adedbc") → "adedbc"
 */
public class DelDel {

    public String delDel(String str) {
        if (str.length() > 3) {
            String start = str.substring(0, 1);
            boolean isDel = str.startsWith("del", 1);
            String last = str.substring(4, str.length());
            if (isDel) {
                return start + last;
            }
        }
        if (str.length() < 3) {
            return str;
        }
        return str;
    }

}

package functional_1;

import java.util.List;

/**
 * Given a list of strings, return a list where each string has all its "x" removed.
 * <p>
 * <p>
 * noX(["ax", "bb", "cx"]) → ["a", "bb", "c"]
 * noX(["xxax", "xbxbx", "xxcx"]) → ["a", "bb", "c"]
 * noX(["x"]) → [""]
 */
public class NoX {
    public List<String> noX(List<String> strings) {
        strings.replaceAll(s -> s.replace("x", "").trim());
        return strings;
    }
}

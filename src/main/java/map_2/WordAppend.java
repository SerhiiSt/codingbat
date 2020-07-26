package map_2;

import java.util.HashMap;
import java.util.Map;

/**
 * Loop over the given array of strings to build a result string
 * like this: when a string appears the 2nd, 4th, 6th, etc.
 * time in the array, append the string to the result.
 * Return the empty string if no string appears a 2nd time.
 * <p>
 * <p>
 * wordAppend(["a", "b", "a"]) → "a"
 * wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
 * wordAppend(["a", "", "a"]) → "a"
 */
public class WordAppend {
    public String wordAppend(String[] strings) {

        StringBuilder result = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();

        for (String currentString : strings) {
            int i = 0;
            if (map.containsKey(currentString)) {
                i = map.get(currentString) + 1;
                map.put(currentString, i);
                if (i % 2 == 0) {
                    result.append(currentString);
                }
            } else {
                map.put(currentString, i + 1);
            }

        }

        return result.toString();
    }
}

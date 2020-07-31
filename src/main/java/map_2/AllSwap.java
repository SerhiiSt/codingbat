package map_2;

import java.util.HashMap;
import java.util.Map;

/**
 * We'll say that 2 strings "match" if they are non-empty and their first chars are the same.
 * Loop over and then return the given array of non-empty strings as follows:
 * if a string matches an earlier string in the array, swap the 2 strings in the array.
 * When a position in the array has been swapped,
 * it no longer matches anything.
 * Using a map, this can be solved making just one pass over the array.
 * More difficult than it looks.
 * <p>
 * <p>
 * allSwap(["ab", "ac"]) → ["ac", "ab"]
 * allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]
 * allSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]
 */
public class AllSwap {
    public String[] allSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        int i = 0;
        while (i < strings.length) {
            String key = String.valueOf(strings[i].charAt(0));
            if (map.containsKey(key)) {
                int index = map.get(key);
                String temp = strings[index];
                strings[index] = strings[i];
                strings[i] = temp;

                map.remove(key);
            } else {
                map.put(key, i);
            }
            i++;
        }
        return strings;
    }
}

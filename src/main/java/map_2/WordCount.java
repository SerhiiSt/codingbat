package map_2;

import java.util.HashMap;
import java.util.Map;

/**
 * The classic word-count algorithm: given an array of strings, return a Map<String, Integer>
 * with a key for each different string,
 * with the value the number of
 * times that string appears in the array.
 * <p>
 * <p>
 * wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
 * wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
 * wordCount(["c", "c", "c", "c"]) → {"c": 4}
 */
public class WordCount {

    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> words = new HashMap<>();

        for (String s : strings) {
            if (!words.containsKey(s)) {
                words.put(s, 1);
            } else {
                int count = words.get(s);
                words.put(s, count + 1);
            }
        }
        return words;
    }

}

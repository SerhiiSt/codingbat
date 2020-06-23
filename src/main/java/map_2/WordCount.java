package map_2;

import java.util.HashMap;
import java.util.Map;

public class WordCount {

    public static Map<String, Integer> wordCount(String[] text) {
        Map<String, Integer> words = new HashMap<>();

        for (String s : text) {
            if (!words.containsKey(s)) {
                words.put(s, 1);
            } else {
                int count = words.get(s);
                words.put(s, count + 1);
            }
        }
        return words;
    }

    public static void main(String[] args) {
        String[] text = {"a", "text", "rt", "b", "c", "a", "o", "t", "rt"};
        System.out.println(wordCount(text));
    }
}

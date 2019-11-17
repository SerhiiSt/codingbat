package ap1;

/**
 * Created by Sergio on 11/14/19.
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array of strings, return a new array containing the first N strings. N will be in the range 1..length.
 * <p>
 * wordsFront(["a", "b", "c", "d"], 1) → ["a"]
 * wordsFront(["a", "b", "c", "d"], 2) → ["a", "b"]
 * wordsFront(["a", "b", "c", "d"], 3) → ["a", "b", "c"]
 */


public class WordsFront {

    public String[] wordsFront(String[] words, int n) {

        String[] text = new String[n];
        for (int i = 0; i < n; i++) {
            text[i] = words[i];
        }

        return text;

    }
}

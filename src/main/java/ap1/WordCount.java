package ap1;

/**
 * Created by Sergio on 11/14/19.
 */

/**
 * Given an array of strings, return the count of the number of strings with the given length.
 * <p>
 * wordsCount(["a", "bb", "b", "ccc"], 1) → 2
 * wordsCount(["a", "bb", "b", "ccc"], 3) → 1
 * wordsCount(["a", "bb", "b", "ccc"], 4) → 0
 */

public class WordCount {

    public int wordsCount(String[] words, int len) {

        int count = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == len) {
                count++;
            }
        }
        return count;
    }

}

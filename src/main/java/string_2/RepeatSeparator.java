package string_2;

/**
 * Created by Sergio on 2/21/19.
 */

/**
 * Given two strings, word and a separator sep,
 * return a big string made of count occurrences of the word,
 * separated by the separator string.

 repeatSeparator("Word", "X", 3) → "WordXWordXWord"
 repeatSeparator("This", "And", 2) → "ThisAndThis"
 repeatSeparator("This", "And", 1) → "This"
 */
public class RepeatSeparator {

    public String repeatSeparator(String word, String sep, int count) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {


            for (int h = 0; h < count; h++) {

                builder.append(word + sep);
            }
            builder.delete(builder.lastIndexOf(sep), builder.length());


            return builder.toString();
        }
        return "";
    }
}

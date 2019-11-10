package array_1;

/**
 * Created by Sergio on 11/10/19.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
 * makePi() → [3, 1, 4]
 */
public class MakePi {

    public int[] makePi() {
        double pi = Math.PI;
        String result = String.format("%.2f", pi);
        String[] text = result.split("");

        List<String> output = new ArrayList<>();

        for (int i = 0; i < text.length; i++) {
            if (!text[i].equals(".")) {
                output.add(text[i]);
            }
        }

        int[] numbers = new int[output.size()];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(output.get(i));
        }

        return numbers;

    }
}

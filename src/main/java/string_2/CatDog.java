package string_2;

/**
 * Created by Sergio on 2/21/19.
 */

/**
 * Return true if the string "cat" and "dog" appear the same number of times in the given string.

 catDog("catdog") → true
 catDog("catcat") → false
 catDog("1cat1cadodog") → true
 */
public class CatDog {

    public boolean catDog(String str) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                count1++;
            }
            if (str.substring(i, i + 3).equals("dog")) {
                count2++;
            }
        }
        if (count1 == count2) {
            return true;
        }
        return false;
    }

}

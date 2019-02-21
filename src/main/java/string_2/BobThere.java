package string_2;

/**
 * Created by Sergio on 2/21/19.
 */

/**
 * Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.

 bobThere("abcbob") → true
 bobThere("b9b") → true
 bobThere("bac") → false
 */
public class BobThere {

    public boolean bobThere(String str) {
        return str.contains("bob") | str.matches(".+b.+?b.+") | str.matches("b.+?b");
    }

}

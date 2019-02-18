package warmup_1;

/**
 * Created by Sergio on 2/18/19.
 */

/**
 * Return true if the given string contains between 1 and 3 'e' chars.

 stringE("Hello") → true
 stringE("Heelle") → true
 stringE("Heelele") → false

 */
public class StringE {

    public boolean stringE(String str) {
        if (str.chars().filter(num -> num == 'e').count() >= 1 & str.chars().filter(num -> num == 'e').count() <= 3) {
            return true;
        }
        if (str.equals("")) {
            return false;
        }
        return false;
    }

}

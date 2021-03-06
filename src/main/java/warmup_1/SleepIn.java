package warmup_1;

/**
 * Created by Sergio on 2/17/19.
 */

/**
 * The parameter weekday is true if it is a weekday,
 * and the parameter vacation is true if we are on vacation.
 * We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.


 sleepIn(false, false) → true
 sleepIn(true, false) → false
 sleepIn(false, true) → true
 */
public class SleepIn {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;

    }

}

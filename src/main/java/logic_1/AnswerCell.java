package logic_1;

/**
 * Created by Sergio on 2/20/19.
 */

/**
 * Your cell phone rings. Return true if you should answer it.
 * Normally you answer, except in the morning you only answer if it is your mom calling.
 * In all cases, if you are asleep, you do not answer.

 answerCell(false, false, false) → true
 answerCell(false, false, true) → false
 answerCell(true, false, false) → false
 */
public class AnswerCell {

    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isMom) {
            if (isMorning & !isAsleep) {
                return true;
            }
            if (!isMorning & !isAsleep) {
                return true;
            }
            if (isMorning & isAsleep) {
                return false;
            }
        }
        if (!isMom) {
            if (!isMorning & isAsleep) {
                return false;
            }
            if (isMorning & !isAsleep) {
                return false;
            }
            if (!isMorning & !isAsleep) {
                return true;
            }
        }

        return false;
    }

}

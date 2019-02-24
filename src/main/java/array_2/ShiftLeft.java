package array_2;

/**
 * Created by Sergio on 2/24/19.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}.
 * You may modify and return the given array, or return a new array.

 shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
 shiftLeft([1, 2]) → [2, 1]
 shiftLeft([1]) → [1]
 */
public class ShiftLeft {

    public int[] shiftLeft(int[] nums) {
        if (nums.length != 0) {
            List<Integer> intList = new ArrayList<Integer>();
            for (int i : nums) {
                intList.add(i);
            }

            int first_element = intList.get(0);
            intList.add(first_element);
            intList.remove(0);
            int[] new_nums = intList.stream().mapToInt(i -> i).toArray();


            return new_nums;
        }
        return nums;

    }

}

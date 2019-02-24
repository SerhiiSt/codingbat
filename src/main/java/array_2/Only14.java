package array_2;

/**
 * Created by Sergio on 2/24/19.
 */

/**
 *Given an array of ints, return true if every element is a 1 or a 4.

 only14([1, 4, 1, 4]) → true
 only14([1, 4, 2, 4]) → false
 only14([1, 1]) → true
 */
public class Only14 {

    public boolean only14(int[] nums) {
        int count = 0;
        if (nums.length == 0)
            return true;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1 && nums[i] == 4 || (nums[i] == 1 | nums[i] == 4))
                count++;
            if (count == nums.length)
                return true;
        }

        return false;
    }
}

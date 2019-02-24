package array_2;

/**
 * Created by Sergio on 2/24/19.
 */

/**
 * Given an array of ints, return true if it contains no 1's or it contains no 4's.

 no14([1, 2, 3]) → true
 no14([1, 2, 3, 4]) → false
 no14([2, 3, 4]) → true
 */
public class No14 {

    public boolean no14(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] == 1 & nums[j] == 4) || (nums[i] == 4 & nums[j] == 1)) {
                    return false;
                }
            }


        }
        return true;


    }
}

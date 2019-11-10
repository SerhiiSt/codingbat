package array_1;

/**
 * Created by Sergio on 11/10/19.
 */


import java.util.Arrays;

/**
 * Given an array of ints length 3,
 * figure out which is larger, the first or
 * last element in the array, and set all
 * the other elements to be that value. Return the changed array.

 maxEnd3([1, 2, 3]) → [3, 3, 3]
 maxEnd3([11, 5, 9]) → [11, 11, 11]
 maxEnd3([2, 11, 3]) → [3, 3, 3]
 */
public class MaxEnd3 {

    public static int[] maxEnd3(int[] nums) {

        int start = 0;
        int end = nums.length - 1;
        int max = Math.max(nums[start], nums[end]);
        nums[start] = max;
        nums[start + 1] = max;
        nums[end] = max;

        return nums;

    }

}

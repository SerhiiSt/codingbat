package array_1;

/**
 * Created by Sergio on 11/10/19.
 */

import java.util.Arrays;

/**
 * Given an array of ints length 3,
 * return a new array with the elements
 * in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
 * <p>
 * reverse3([1, 2, 3]) → [3, 2, 1]
 * reverse3([5, 11, 9]) → [9, 11, 5]
 * reverse3([7, 0, 0]) → [0, 0, 7]
 */
public class Reverse3 {

    public int[] reverse3(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
        return nums;

    }

}

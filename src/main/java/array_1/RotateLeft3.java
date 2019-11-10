package array_1;

/**
 * Created by Sergio on 11/10/19.
 */

import java.util.Arrays;

/**
 * Given an array of ints length 3,
 * return an array with the elements "rotated left"
 * so {1, 2, 3} yields {2, 3, 1}.
 * <p>
 * rotateLeft3([1, 2, 3]) → [2, 3, 1]
 * rotateLeft3([5, 11, 9]) → [11, 9, 5]
 * rotateLeft3([7, 0, 0]) → [0, 0, 7]
 */
public class RotateLeft3 {

    public int[] rotateLeft3(int[] nums) {

        int temp = nums[1];
        nums[1] = nums[0];
        nums[0] = temp;
        temp = nums[1];
        nums[1] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;

        return nums;
    }

}

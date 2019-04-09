package array_2;

/**
 * Created by Sergio on 3/4/19.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Return a version of the given array where all the 10's have been removed.
 * The remaining elements should shift left towards the start of the array as needed,
 * and the empty spaces a the end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}.
 * You may modify and return the given array or make a new array.

 withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
 withoutTen([10, 2, 10]) → [2, 0, 0]
 withoutTen([1, 99, 10]) → [1, 99, 0]
 */
public class WithoutTen {

    public static int[] withoutTen(int[] nums) {

        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] == 10) {
                nums[i] = 0;
            }
        }

        int count = 0;

        for (int k = 0; k < nums.length; k++) {
            if (nums[k] != 0) {
                temp[count] = nums[k];
                count++;
            }
        }

        return temp;

    }

}

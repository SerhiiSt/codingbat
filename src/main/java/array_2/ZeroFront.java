package array_2;

/**
 * Created by Sergio on 3/3/19.
 */

import java.util.Arrays;

/**
 * Return an array that contains the exact same numbers as the given array,
 * but rearranged so that all the zeros are grouped at the start of the array.
 * The order of the non-zero numbers does not matter.
 * So {1, 0, 0, 1} becomes {0 ,0, 1, 1}.
 * You may modify and return the given array or make a new array.
 *
 zeroFront([1, 0, 0, 1]) → [0, 0, 1, 1]
 zeroFront([0, 1, 1, 0, 1]) → [0, 0, 1, 1, 1]
 zeroFront([1, 0]) → [0, 1]
 */
public class ZeroFront {

    public int[] zeroFront(int[] nums) {

        int k = 0, temp;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (i != k) {
                    temp = nums[i];
                    nums[i] = nums[k];
                    nums[k] = temp;
                }
                k++;
            }


        }
        return nums;


    }

}

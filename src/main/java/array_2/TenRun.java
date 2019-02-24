package array_2;

/**
 * Created by Sergio on 2/21/19.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * For each multiple of 10 in the given array,
 * change all the values following it to be that multiple of 10,
 * until encountering another multiple of 10.
 * So {2, 10, 3, 4, 20, 5}
 * yields {2, 10, 10, 10, 20, 20}.

 tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]
 tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]
 tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]
 */
public class TenRun {

    //variant 1
    public static int[] tenRun(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                for (int j = i + 1; j < nums.length && !(nums[j] % 10 == 0); j++) {

                    nums[j] = nums[i];


                }

            }

        }
        return nums;

    }

    //variant 2
    public static int[] tenRun2(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] % 10 == 0 && nums[i + 1] % 10 != 0) {

                nums[i + 1] = nums[i];

            }
        }
        return nums;

    }

}

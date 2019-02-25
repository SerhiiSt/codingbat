package array_2;

/**
 * Created by Sergio on 2/25/19.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Given a non-empty array of ints, return a new array
 * containing the elements from the original array
 * that come after the last 4 in the original array.
 * The original array will contain at least one 4.
 * Note that it is valid in java to create an array of length 0.

 post4([2, 4, 1, 2]) → [1, 2]
 post4([4, 1, 4, 2]) → [2]
 post4([4, 4, 1, 2, 3]) → [1, 2, 3]
 */
public class Post4 {

    public int[] post4(int[] nums) {

        List<Integer> list = new ArrayList<>();

        for (int i = nums.length - 1; i > 0 && nums[i] != 4; i--) {
            list.add(nums[i]);
        }
        Collections.reverse(list);

        int[] new_array = list.stream().mapToInt(Integer::intValue).toArray();
        return new_array;
    }

}

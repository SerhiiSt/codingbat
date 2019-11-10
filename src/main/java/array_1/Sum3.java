package array_1;

/**
 * Created by Sergio on 11/10/19.
 */

/**
 * Given an array of ints length 3, return the sum of all the elements.
 * <p>
 * sum3([1, 2, 3]) → 6
 * sum3([5, 11, 2]) → 18
 * sum3([7, 0, 0]) → 7
 */
public class Sum3 {

    public int sum3(int[] nums) {

        int sum = 0;

        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

}
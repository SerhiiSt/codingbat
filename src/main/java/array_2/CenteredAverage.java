package array_2;

/**
 * Created by Sergio on 2/24/19.
 */

/**
 * Return the "centered" average of an array of ints,
 * which we'll say is the mean average of the values,
 * except ignoring the largest and smallest values in the array.
 * If there are multiple copies of the smallest value,
 * ignore just one copy, and likewise for the largest value.
 * Use int division to produce the final average.
 * You may assume that the array is length 3 or more.

 centeredAverage([1, 2, 3, 4, 100]) → 3
 centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
 centeredAverage([-10, -4, -2, -4, -2, 0]) → -3
 */
public class CenteredAverage {

    public int centeredAverage(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int currentValue = nums[0];

        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentValue = nums[i];
            sum += nums[i];
            min = Math.min(min, currentValue);
            max = Math.max(max, currentValue);
        }

        sum -= max + min;

        int avg = sum / (nums.length - 2);

        return avg;
    }

}

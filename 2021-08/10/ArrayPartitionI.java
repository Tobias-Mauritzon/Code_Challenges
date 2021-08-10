import java.util.*;

/**
 * Given an integer array nums of 2n integers, 
 * group these integers into n pairs (a1, b1), (a2, b2), ..., (an, bn) such that the sum of min(ai, bi) for all i is maximized. 
 * Return the maximized sum.
 */

public class ArrayPartitionI {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);

        int sum = 0;

        for(int i = nums.length-2; i >= 0; i-=2){
            sum += nums[i];
        }
        return sum;
    }
}

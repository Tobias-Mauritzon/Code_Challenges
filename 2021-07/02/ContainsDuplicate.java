import java.util.Arrays;

/**
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 */

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        for(int i = 1; i < len; i++){
            if(nums[i-1] == nums[i])return true;
        }

        return false;
    }
}
import java.util.HashMap;

/**
 * We define a harmonious array as an array where the difference between its maximum value and its minimum value is exactly 1.

    Given an integer array nums, return the length of its longest harmonious subsequence among all its possible subsequences.

    A subsequence of array is a sequence that can be derived from the array by deleting some or no elements without changing the order of the remaining elements.
 */

public class LongestHarmoniousSubsequence {

    public int findLHS(int[] nums) {
        HashMap<Long,Integer> map = new HashMap<>();
    
        for(long n : nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        int result = 0;

        for (long key : map.keySet()) {
            if (map.containsKey(key + 1)) {
                result = Math.max(result, map.get(key + 1) + map.get(key));
            }
        }
        return result;
    }
}

import java.util.HashMap;
/**
 * Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
 */

public class ContainsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        for(int i = 0; i < len; i++){
            
            Integer lastIndex = map.put(nums[i], i);

            if(lastIndex != null){
                if(Math.abs(lastIndex - i) <= k)return true;
            }
            
        }

        return false;
    }
}
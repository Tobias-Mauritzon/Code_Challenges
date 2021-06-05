import java.util.HashMap;
import java.util.Map;

public class twoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		twoSum(new int[] {1,2,3,7},9);
	}
	
	public static int[] twoSum(int[] nums, int target) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>(); 
	
		//fills map with key(number) value(index) pairs	
        for(int i = 0; i< nums.length; i++ ) {
			map.put(nums[i],i);
        }
 	    
		//gets diff and look for it in the map.
        for (int i = 0; i < nums.length; i++){
        	int diff = target - nums[i];
            if(map.containsKey(diff) && i != map.get(diff)) {
            	return new int[] {i,map.get(diff)};
            }
        }
        return new int[] {};
    }

}
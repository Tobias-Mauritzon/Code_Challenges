import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array nums of n integers where nums[i] is in the range [1, n], 
 * return an array of all the integers in the range [1, n] that do not appear in nums.
 */
public class DisappearedNumbersInArr {

    public List<Integer> findDisappearedNumbers4(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i + 1 && nums[i] != nums[nums[i] - 1]) {
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }

        for(int i = 0; i<nums.length; i++){
            if(nums[i] != i+1)list.add(i+1);
        }

        return list;
    }

    public List<Integer> findDisappearedNumbers2(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();


        for(int i = 0; i < nums.length; i++){
            
            int newNum = nums[i];
            if(newNum !=  nums[newNum-1]){
                nums[i] = nums[newNum-1];
                nums[newNum-1] = newNum;  
                i--;  
            }
        }

        for(int i = 0; i<nums.length; i++){
            if(nums[i] != i+1)list.add(i+1);
        }

        return list;
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int len = nums.length;
        int arr[] = new int[len+1];
        arr[0] = 0;
        for (int i : nums) {
            arr[i] = i;
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 1; i<len+1; i++){
            if(arr[i] == 0)list.add(i);
        }

        return list;
    }
}
/**
 * n == nums.length
1 <= n <= 105
1 <= nums[i] <= n
 */
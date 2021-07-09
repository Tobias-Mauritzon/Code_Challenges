import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
 * 
 * Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?
 * 
 */

public class MissingNumber {

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        System.out.println(test(arr));
    }

    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(i != nums[i])return i;
        }
        return nums.length;
    }

    public int missingNumber2(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            set.add(i);
        }

        set.add(nums.length);

        for(int num : nums){
            set.remove(num);
        }

        Iterator<Integer> it = set.iterator();
        return it.next();
    }

    public static int test(int[] nums) {
        int num = (int)Math.pow(10, 4);

        int num2 = 0;

        for(int i = 0; i <= num; i++){
            num2+= i;
        }

        return num2;
    }

    public int missingNumber3(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i != 0) nums[0] += nums[i];   // storing sum of all array numbers in the 1st element of the array
        }
        return (nums.length*(nums.length+1))/2-nums[0]; 
		// returning diff between sum of n numbers and our sum
    }


}

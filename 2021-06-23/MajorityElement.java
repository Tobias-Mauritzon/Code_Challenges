import java.util.Arrays;
import java.util.HashMap;

/**
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 */
public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[] {1})); // 1
        System.out.println(majorityElement(new int[] {3,2,3})); // 3
        System.out.println(majorityElement(new int[] {2,2,1,1,1,2,2})); // 2
    }

    public static int majorityElement2(int[] nums) {
        Arrays.sort(nums);
        int key = nums[nums.length/2];
        return key;
    }

    public static int majorityElement(int[] nums) {
        if(nums.length == 1)return nums[0];

        int maj = nums.length/2;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            Integer temp = map.get(num);
            if(temp != null){
                temp += 1;
                if(temp > maj)return num;
                map.put(num, temp);
            }else{
                map.put(num, 1);
            }
        }

        return -1;
    }
}

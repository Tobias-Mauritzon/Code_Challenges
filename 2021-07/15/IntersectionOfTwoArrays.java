import java.util.Arrays;
import java.util.HashSet;

/**
 * Given two integer arrays nums1 and nums2, return an array of their intersection. 
 * Each element in the result must be unique and you may return the result in any order.
 */
public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();

        // sorting arrays
        Arrays.sort(nums1);
        Arrays.sort(nums2);


        int i = 0;
        int j = 0;

        /**
         * Since the arrays are sorted we can compare the first number and if they are not the same we increase
         * the counter for the lower number.
         */
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                set.add(nums1[i]);
                j++;
                i++;
            }else if(nums1[i] < nums2[j]){
                i++;
            }else{
                j++;
            }
        }

        int nums[] = new int[set.size()];
        i = 0;
        for (int num : set) {
            nums[i] = num;
            i++;
        }

        return nums;
    }
}

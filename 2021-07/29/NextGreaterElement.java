/**
 * The next greater element of some element x in an 
 * array is the first greater element that is to the right of x in the same array.
 * You are given two distinct 0-indexed integer arrays nums1 and nums2, 
 * where nums1 is a subset of nums2.
 * For each 0 <= i < nums1.length, 
 * find the index j such that nums1[i] == nums2[j] and 
 * determine the next greater element of nums2[j] in nums2. 
 * If there is no next greater element, then the answer for this query is -1.
 * Return an array ans of length nums1.length such 
 * that ans[i] is the next greater element as described above.
 */
public class NextGreaterElement {

    //If the method is used on the same system then changing the original array
    //could be bad and cause errors later in code;
    //that is why method 2 was made
    public int[] nextGreaterElement2(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            int num = nums1[i];
            boolean found = false;
            for(int j = 0; j < nums2.length; j++){
                if(num == nums2[j])found = true;
                
                if(found){
                    if(nums2[j] > num){
                        arr[i] = nums2[j];
                        found = false;
                        break;
                    }
                }
            }
            if(found)arr[i] = -1; 
        }
        return nums1;
    }
    
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for(int i = 0; i < nums1.length; i++){
            int num = nums1[i];
            boolean found = false;
            for(int j = 0; j < nums2.length; j++){
                if(num == nums2[j])found = true;
                
                if(found){
                    if(nums2[j] > num){
                        nums1[i] = nums2[j];
                        found = false;
                        break;
                    }
                }
            }
            if(found)nums1[i] = -1; 
        }
        return nums1;
    }
}

public class RemoveElement {
    
	//Returns the length of valid numbers
    public static int removeElement(int[] nums, int val) {
        if(nums.length == 0)return 0;
        int index = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }
}

/**
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * Note that you must do this in-place without making a copy of the array.
 */
public class MoveZeroes {

    //moves each non zero digit to current index then fills en of array with zeros
    public void moveZeroes3(int[] nums) {
        int index = 0;

        for(int i = index; i < nums.length; i++){
            if(nums[i] != 0){
                nums[index] = nums[i];
                index++;
            }
        }
        

        for(int i = index; i < nums.length; i++){
            nums[i] = 0;
        }
    }

    //Starts from back of array and moves each number left oone time when a zero is encounterd
    //and puts a zero last
    public void moveZeroes2(int[] nums) {

        int firstZero = nums.length-1;

        for(int i = firstZero; i >= 0; i--){
            if(nums[i] == 0){
                for(int j = i; j < firstZero; j++){
                    nums[j] = nums[j+1];
                    if(j == firstZero-1)nums[j+1] = 0;
                }
                firstZero--;
            }
        }
    }

    public void moveZeroes(int[] nums) {

        int firstZero = nums.length-1;

        for(int i = firstZero; i >= 0; i--){
            if(nums[i] == 0){
                int temp;
                for(int j = i; j < firstZero; j++){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
                firstZero--;
            }
        }
    }
    
}

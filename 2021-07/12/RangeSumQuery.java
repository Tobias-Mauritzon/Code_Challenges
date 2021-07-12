public class RangeSumQuery {

    int nums[];

    /**
     * Only use with sumrange
     * 
     * @param nums NumArray(int[] nums) Initializes the object with the integer array nums
     */
    public RangeSumQuery(int[] nums) {
        this.nums = nums;
    }

    //The n is just there so i can have 2 construktors
    public RangeSumQuery(int[] nums, int n) {
        this.nums = new int[nums.length];

        this.nums[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            this.nums[i] = this.nums[i-1]+nums[i];
        }
    }
    
    /**
     * int sumRange(int left, int right)
     * @param left index
     * @param right index
     * @return  the sum of the elements of nums between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).
     */
    public int sumRange(int left, int right) {
        int retVal = 0;
        for(int i = left; i <= right; i++){
            retVal += nums[i];
        }

        return retVal; 
    }

    public int sumRange2(int left, int right) {

        if(left == 0) return this.nums[right];
        return this.nums[right] - this.nums[left-1];
    }
    /**
     * 1 <= nums.length <= 104
     * -105 <= nums[i] <= 105
     * 0 <= left <= right < nums.length
     * At most 104 calls will be made to sumRange.
     */
}

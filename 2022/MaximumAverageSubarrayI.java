public class MaximumAverageSubarrayI {
    public static void main(String[] args) {
        //int[] arr = {1,2,3,4,5,6};
        int[] arr = {-50,-43};
    
        System.out.println(findMaxAverage2(arr,1));
 
    }

    public static double findMaxAverage(int[] nums, int k) {
        double maxAvg = Integer.MIN_VALUE;
        for (int i = 0; i+k-1 < nums.length; i++) {
            double maxTemp = 0;
            for (int j = i;j < i+k; j++) {
                maxTemp += nums[j];   
            }
            maxTemp = maxTemp/k;
            maxAvg = Math.max(maxTemp, maxAvg);
        }
        return maxAvg;
    };

    // fel någonstans
    public static double findMaxAverage2(int[] nums, int k) {
        if(nums.length == 1)return nums[0];
        double maxAvg = Integer.MIN_VALUE;
        double maxTemp = 0;
        for (int i = 0; i < nums.length; i++) {
            maxTemp += nums[i];
            if(i >= k-1){
                double tempAvg = maxTemp/k;
                maxAvg = Math.max(tempAvg, maxAvg);
                maxTemp -= nums[i-k+1];
            }
        }
        return maxAvg;
    };
    
    
}

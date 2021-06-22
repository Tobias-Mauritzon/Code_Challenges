import java.util.HashMap;

public class TwoSumII {

    public static void main(String[] args) {
        twoSum(new int[]{2,7,11,15}, 9);
        twoSum(new int[]{2,3,4}, 6);
    }

    
    //Return the indices of the two numbers (1-indexed) as an integer array

    // Since the array is sorted this is actually a bad solution because we will create an unbalanaced tree
    // But we can't scramble the array because then we can't be sure we return the correct index
    public static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ret = new int[2];

        for(int i = 0; i < numbers.length; i++){
            int search = target - numbers[i];
            if(map.containsKey(search)){
                ret[0] = map.get(search) + 1;
                ret[1] = i + 1;
                break;
            }

            map.put(numbers[i], i);
        }

        return ret;
    }
	
	// Great solution
    public static int[] twoSum2(int[] numbers, int target) {
        int n = numbers.length;
        int i=0, j=n-1;
        while(i<j)
        {
            if(numbers[i]+numbers[j]>target) j--;
            else if(numbers[i]+numbers[j]<target) i++;
            else return new int[]{i+1,j+1};
            
        }
        return new int[]{};
    }
}

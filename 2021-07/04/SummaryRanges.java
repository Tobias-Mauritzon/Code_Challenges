import java.util.ArrayList;
import java.util.List;

/**
 *   You are given a sorted unique integer array nums.
 *
 *   Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.
 *
 *   Each range [a,b] in the list should be output as:
 *
 *   "a->b" if a != b
 *   "a" if a == b
 */
public class SummaryRanges {

    public List<String> summaryRanges(int[] nums) {

        ArrayList<String> arr = new ArrayList<>();
        if(nums.length == 0)return arr;
        if(nums.length == 1){
            arr.add(""+nums[0]);
            return arr;
        }
        
        int len = nums.length;

        int firstNum = nums[0];
        int lastNum = nums[0];

        for(int i = 1; i < len; i++){
            if(nums[i] == lastNum+1){
                lastNum = nums[i];
            }else if(firstNum == lastNum){
                arr.add(""+firstNum);
                firstNum = nums[i];
                lastNum = nums[i];
            }else{
                arr.add(firstNum + "->"+lastNum);
                firstNum = nums[i];
                lastNum = nums[i];
            }
        }

        if(firstNum == lastNum){
            arr.add(""+firstNum);
        }else{
            arr.add(firstNum + "->"+lastNum);
        }

        return arr;
    }
}

import java.util.HashSet;

public class ThirdMaximumNumber {

    public int thirdMax2(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for(int n : nums){
            set.add(n);
            if(!(n == max || n == second || n == third)){
                if(n > max){
                    third = second;
                    second = max;
                    max = n;
                }
                else if(n > second){
                    third = second;
                    second = n;
                }else if(n > third){
                    third = n;
                }
            } 
        }

        if(set.size() < 3)return max;
        return third;
    }

    public int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n); 
        }

        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for(int n : set){
            if(n > max){
                third = second;
                second = max;
                max = n;
            }
            else if(n > second){
                third = second;
                second = n;
            }else if(n > third){
                third = n;
            } 
        }

        if(set.size() < 3)return max;
        return third;
    }

    
}

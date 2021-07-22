import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer n, return a string array answer (1-indexed) where:
 * 
 * answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
 * answer[i] == "Fizz" if i is divisible by 3.
 * answer[i] == "Buzz" if i is divisible by 5.
 * answer[i] == i if non of the above conditions are true.
 */
public class FizzBuzz2 {
    
    public List<String> fizzBuzz(int n) {
        
        ArrayList<String> list = new ArrayList<>();

        for(int i = 1; i < n +1; i++){
            if(i%3 == 0 && i%5 == 0){
                list.add("FizzBuzz");
            }else if(i%3==0){
                list.add("Fizz");
            }else if(i%5==0){
                list.add("Buzz");
            }else{
                list.add(""+i);
            }
        }

        return list;
    }

    // Using String.valueOf seemex to reduce execution time of the tests from 5 ms to 1 ms
    // And using i <=n instead of i < n+1 seemed to increase memory usage
    public List<String> fizzBuzz2(int n) {
        
        ArrayList<String> list = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            if(i%3 == 0 && i%5 == 0){
                list.add("FizzBuzz");
            }else if(i%3==0){
                list.add("Fizz");
            }else if(i%5==0){
                list.add("Buzz");
            }else{
                list.add(String.valueOf(i));
            }
        }

        return list;
    }
}


/**
 * A perfect number is a positive integer that is equal to the sum of its positive divisors, 
 * excluding the number itself. A divisor of an integer x is an integer that can divide x evenly.
 * 
 * Given an integer n, return true if n is a perfect number, otherwise return false.
 */

public class PerfectNumber {
    public boolean checkPerfectNumber(int num) {
        int sum = -num;
        for (int i = 1; i<=Math.sqrt(num) && sum <= num; i++){
            if (num%i==0){
                if (num/i == i){
                    sum += i;
                }
                else{ 
                    sum += i + (num/i);
                }
            }
        }
        return sum == num;
    }
}
/**
 * Constraints:

    1 <= num <= 108 
 */

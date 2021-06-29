import java.util.HashSet;

/**
 * A happy number is a number defined by the following process:

    Starting with any positive integer, replace the number by the sum of the squares of its digits.
    Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
    Those numbers for which this process ends in 1 are happy.
    Return true if n is a happy number, and false if not.
 */
public class HappyNumber {

    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();

        while(!set.contains(n)){
            if(n == 1)return true;
            
            set.add(n);
            String temp = ""+n;
            n = 0;

            for(int i = 0; i < temp.length(); i++){
                int val = Character.getNumericValue(temp.charAt(i));
                n += (int) Math.pow(val, 2) ;
            }
            
        }


        return false;
    }
}
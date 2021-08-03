
/**
 * Given an integer num, return a string of its base 7 representation.
 */
public class Base7 {
    public String convertToBase7(int num) {
        if(num == 0)return "0";
        int number = Math.abs(num);
        StringBuilder strB = new StringBuilder();
        while(number != 0){
            strB.append(number%7);
            number = number/7;
        }

        if(num < 0){
            strB.append("-");
            return strB.reverse().toString();
        }
        return strB.reverse().toString();
    }

    /**
     * -107 <= num <= 107
     */
}

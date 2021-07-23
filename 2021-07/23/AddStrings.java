
/**
 * Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
 * You must solve the problem without using any built-in library for handling large integers (such as BigInteger). 
 * You must also not convert the inputs to integers directly.
 */
public class AddStrings {

    //Using Stringbuilder and append is way faster and saves space compared doing string + string 
    public String addString2(String num1, String num2) {
        StringBuilder str = new StringBuilder();
        int carry = 0;
        int i = num1.length()-1;
        int j = num2.length()-1;
        
        while(i >= 0 || j >= 0 || carry != 0){
            int iVal = i >= 0 ? num1.charAt(i) - '0' : 0;
            int jVal = j >= 0 ? num2.charAt(j) - '0' : 0;
            i--; 
            j--;
            int sum = iVal + jVal + carry;

            //We can only add one number at a time to the string so the carry is 
            //necessary for whe nsum is bigger than 9
            carry = sum/10;
            str.append(sum%10);
        }
        return str.reverse().toString();
    }

    public String addString1(String num1, String num2) {
        String str = ""; 
        int carry = 0;
        int i = num1.length()-1;
        int j = num2.length()-1;
        
        while(i >= 0 || j >= 0 || carry != 0){
            int iVal = i >= 0 ? num1.charAt(i) - '0' : 0;
            int jVal = j >= 0 ? num2.charAt(j) - '0' : 0;
            i--; 
            j--;
            int sum = iVal + jVal + carry;

            //We can only add one number at a time to the string so the carry is 
            //necessary for whe nsum is bigger than 9
            carry = sum/10;
            str = sum%10 + str;
        }
        return str;
    }
 
}

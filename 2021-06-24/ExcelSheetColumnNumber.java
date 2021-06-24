
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Given a string columnTitle that represents the column title as appear in an Excel sheet, return its corresponding column number.
 */
public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        System.out.println(titleToNumber2("A"));// 1
        System.out.println(titleToNumber2("AB"));// 28
        System.out.println(titleToNumber2("ZY"));// 701
        System.out.println(titleToNumber2("FXSHRXW"));// 2147483647
    }
    
    public static int titleToNumber(String columnTitle) {
        int pow = columnTitle.length()-1;
        ArrayList<String> arr = new ArrayList<>(Arrays.asList("0", "A", "B","C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"));

        int retVal = 0;

        for(char c : columnTitle.toCharArray()){
            int times = arr.indexOf(Character.toString(c));
            int valPow = (int)Math.pow(26, pow);
            retVal += times*valPow;
            pow--;
        }
        return retVal;
    }

    // Using Ascii value instead of arr with chars
    public static int titleToNumber2(String columnTitle) {
        int pow = columnTitle.length()-1;
        int retVal = 0;

        for(char c : columnTitle.toCharArray()){
            int asciiValue = (int)c;
            int times = asciiValue-64;

           
            int valPow = (int)Math.pow(26, pow);
            retVal += times*valPow;
            pow--;
        }
        return retVal;
    }
}

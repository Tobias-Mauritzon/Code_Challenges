
/**
 * Write a function that reverses a string. The input string is given as an array of characters s.
 */
public class ReverseStringArray {

    public void reverseString(char[] s) {
        char tempC = ' ';

        for(int i = 0, j = s.length-1;  i<=j; i++, j--){
            tempC = s[i];
            s[i] = s[j];
            s[j] = tempC;
        }
    }
}


/**
 * You are given a string s, return the number of segments in the string. 
 * A segment is defined to be a contiguous sequence of non-space characters.
 */

public class NumberOfSegmentsInString {
    public int countSegments(String s) {
        char[] arr = s.toCharArray();
        boolean last = false;
        int counter = 0;

        for(char c : arr){
            if(c == ' '){
                last = false;
            }
            if(c != ' ' && !last){
                counter++;
                last = true;
            }
        }
        return counter;
    }
}
/**
 * 0 <= s.length <= 300
 * s consists of lower-case and upper-case English letters, digits or one of the following characters "!@#$%^&*()_+-=',.:".
 *  The only space character in s is ' '.
 */

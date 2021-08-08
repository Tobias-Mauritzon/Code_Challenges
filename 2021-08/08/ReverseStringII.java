/**
 * Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.

    If there are fewer than k characters left, reverse all of them. 
    If there are less than 2k but greater than or equal to k characters, 
    then reverse the first k characters and left the other as original.
 */
public class ReverseStringII {
    public String reverseStr(String s, int k) {
        StringBuilder strB = new StringBuilder();

        for(int i = 0; i < s.length(); i +=2*k){
            
            int subOrdStart = Math.min(i+k, s.length());
            int subOrdEnd = Math.min(i+2*k, s.length());

            StringBuilder temp = new StringBuilder(s.substring(i, subOrdStart));
            temp.reverse();
            temp.append(s.substring(subOrdStart, subOrdEnd));
            strB.append(temp);
        }

        return strB.toString();
    }
}

/**
 * Constraints:

    1 <= s.length <= 104
    s consists of only lowercase English letters.
    1 <= k <= 104
 */
import java.util.HashMap;
import java.util.HashSet;

/**
 * Given a string s which consists of lowercase or uppercase letters, 
 * return the length of the longest palindrome that can be built with those letters.
 * Letters are case sensitive, for example, "Aa" is not considered a palindrome here.
 */

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();

        for (char c : s.toCharArray()) {
            if(map.containsKey(c)){
                int num = map.get(c);
                map.put(c, num+1);
            }else{
                map.put(c, 1);
                set.add(c);
            }
        }

        int palLength = 0;
        boolean one = true;

        for(char c : set){
            int num = map.get(c);

            if(one && num%2 != 0){
                one = false;
                palLength += 1;
            }
            
            if(num%2 == 0){
                palLength += num;
            }else{
                palLength += num -1;
            }       
        }
        return palLength;
    }
}

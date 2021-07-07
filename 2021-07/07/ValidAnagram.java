import java.util.Arrays;

/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 */
public class ValidAnagram {
    
    // faster and use less memory, but I need to add s & t toLowerCase if higher case letters were alllowed
    public boolean isAnagram3(String s, String t) {
        if(s.length() != t.length())return false;

        char arrS[] = s.toCharArray();
        char arrT[] = t.toCharArray();

        Arrays.sort(arrS);
        Arrays.sort(arrT);

        for(int i = 0; i < arrS.length; i++){
            if(arrS[i] != arrT[i])return false;
        }

        return true;
    }

    //slower than 1 and use more  memory
    public boolean isAnagram2(String s, String t) {
        if(s.length() != t.length())return false;

        char arrS[] = s.toCharArray();
        char arrT[] = t.toCharArray();

        Arrays.sort(arrS);
        Arrays.sort(arrT);

        for(int i = 0; i < arrS.length; i++){
            if(Character.compare(arrS[i], arrT[i]) != 0)return false;
        }

        return true;
    }

    //fast but uses lots of memory
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())return false;

        char arrS[] = s.toCharArray();
        char arrT[] = t.toCharArray();

        Arrays.sort(arrS);
        Arrays.sort(arrT);

        s = new String(arrS);
        t = new String(arrT);

        return s.equals(t);
    }
}

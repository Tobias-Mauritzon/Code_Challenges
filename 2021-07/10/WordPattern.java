import java.util.HashMap;

/**
 * Given a pattern and a string s, find if s follows the same pattern.
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
 */
public class WordPattern {

    public static void main(String[] args) {
        System.out.println(wordPattern2("abba","dog cat cat dog"));//true
        System.out.println(wordPattern2("abba","dog cat cat aog"));//false
        System.out.println(wordPattern2("aaaa","dog cat cat dog"));//false
    }

    //Both methods use key, value maps and check if the value has been seen before
    public static boolean wordPattern2(String pattern, String s) {
        HashMap<Character,String> map = new HashMap<>();


        String s2[] = s.split(" ");

        if(s2.length != pattern.length())return false;

        for(int i = 0; i < s2.length; i++){
            boolean nullCheck = map.containsValue(s2[i]);
            String prevStr = map.put(pattern.charAt(i) , s2[i]);

            if(nullCheck == true && prevStr == null)return false;

            if(prevStr != null){
                if(!prevStr.equals(s2[i]))return false;
            }
        }

        return true;
    }

    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map = new HashMap<>();
        HashMap<String,Character> map2 = new HashMap<>();

        String s2[] = s.split(" ");

        if(s2.length != pattern.length())return false;

        for(int i = 0; i < s2.length; i++){
            String prevStr = map.put(pattern.charAt(i) , s2[i]);
            Character prevChar = map2.put(s2[i] , pattern.charAt(i));
            if(prevStr != null){
                if(!prevStr.equals(s2[i]))return false;
            }

            if(prevChar != null){
                if(Character.compare(prevChar, pattern.charAt(i)) != 0)return false;
            }
        }

        return true;
    }
}

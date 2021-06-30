import java.util.Stack;


/**
 * Given two strings s and t, determine if they are isomorphic.
 *
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 *
 * All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
 */
public class IsomorphicStrings {

    //Inget att vara stolt över här heller när det kommer till tid eller minne men den blev accepterad
    public boolean isIsomorphic2(String s, String t) {
        
        String newS = s;
        String newT = t;

        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if((newS.indexOf(sChar) != newT.indexOf(tChar)) || s.indexOf(sChar) != t.indexOf(tChar))return false;

            newS = newS.substring(1, newS.length());
            newT = newT.substring(1, newT.length());

        }

        return true;
    }

    //Tog för långt tid enligt hemsidan men den borde funka
    public boolean isIsomorphic(String s, String t) {
        Stack<Integer> stackS = new Stack<>();
        Stack<Integer> stackT = new Stack<>();

        for (Character c : s.toCharArray()) {
            int len = s.lastIndexOf(c);
            for(int i=0; i<=len;i++){
                if(Character.compare(s.charAt(i), c) == 0){
                    stackS.push(i);
                }
            } 
        }

        for (Character c : t.toCharArray()) {
            int len = t.lastIndexOf(c);
            for(int i=0; i<=len;i++){
                if(Character.compare(t.charAt(i), c) == 0){
                    stackT.push(i);
                }
            } 
        }

        if(stackS.size() != stackT.size())return false;

        while(!stackS.isEmpty()){
            if(stackS.pop() != stackT.pop())return false;
        }

        return true;
    }
}

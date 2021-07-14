import java.util.HashSet;

/**
 * Given a string s, reverse only all the vowels in the string and return it.
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both cases.
 */
public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {

        StringBuilder strB = new StringBuilder(s);
        HashSet<Character> set = new HashSet<>();

        set.add('a'); set.add('e'); set.add('i'); set.add('o'); set.add('u');
        set.add('A'); set.add('E'); set.add('I'); set.add('O'); set.add('U');
        
        int i = 0, j = s.length()-1;
        while(i<j){
            char charS = strB.charAt(i);
            char charB =strB.charAt(j);
            if(!set.contains(charS)){
                i++;
            }

            if(!set.contains(charB)){
                j--;
            }
            
            if(set.contains(charS) && set.contains(charB)){

                strB.setCharAt(i, charB);
                strB.setCharAt(j, charS);
                i++;
                j--;
            } 
        }

        return strB.toString(); 
    }

    //I could have made a method that checked if a char was one of the vowels instead of using the 
    // hashSet if(char == vowels)return true;else return false;
}

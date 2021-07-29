import java.util.ArrayList;
import java.util.HashSet;

/**
 * Given an array of strings words, 
 * return the words that can be typed using 
 * letters of the alphabet on only one row of American keyboard like the image below.
 * 
 * In the American keyboard:
 *      the first row consists of the characters "qwertyuiop",
 *      the second row consists of the characters "asdfghjkl", and
 *      the third row consists of the characters "zxcvbnm".
 */
public class KeyboardRow {
    
    public String[] findWords2(String[] words) {
        ArrayList<String> list = new ArrayList<>();
        
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();
        HashSet<Character> set3 = new HashSet<>();

        for(char c : "qwertyuiop".toCharArray())set1.add(c);
        for(char c : "asdfghjkl".toCharArray())set2.add(c);
        for(char c : "zxcvbnm".toCharArray())set3.add(c);

        
        for(String s : words){
            HashSet<Character> temp = new HashSet<>();
            
            for(char c : s.toLowerCase().toCharArray())temp.add(c);
            if(set1.containsAll(temp))list.add(s);
            else if(set2.containsAll(temp))list.add(s);
            else if(set3.containsAll(temp))list.add(s);
        }
 
        return list.toArray(new String[list.size()]);
    } 

    // More readable but does the same as method 2
    public String[] findWords(String[] words) {
        ArrayList<String> list = new ArrayList<>();
        
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();
        HashSet<Character> set3 = new HashSet<>();

        for(char c : "qwertyuiop".toCharArray())set1.add(c);
        for(char c : "asdfghjkl".toCharArray())set2.add(c);
        for(char c : "zxcvbnm".toCharArray())set3.add(c);

        
        for(String s : words){
            HashSet<Character> temp = new HashSet<>();
            
            for(char c : s.toLowerCase().toCharArray())temp.add(c);
            
            if(set1.containsAll(temp)){
                list.add(s);
            }
            else if(set2.containsAll(temp)){
                list.add(s);
            }
            else if(set3.containsAll(temp)){
                list.add(s);
            }
        }

        String[] arr = new String[list.size()];

        int i = 0;
        for(String s : list){
            arr[i] = s;
            i++;
        }
 
        return arr;
    }    
}

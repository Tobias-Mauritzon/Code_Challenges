import java.util.HashMap;

public class FirstUniqChar {
    /**
     * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
     */
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        char arr[] = s.toCharArray();

        for(char c : arr){
            if(map.containsKey(c)){
                map.put(c, 2);
            }else{
                map.put(c, 1);
            }              
        }

        

        for(int i = 0; i < arr.length; i++){
            if(map.put(arr[i], 2) == 1){
                return i;
            }
        }
        return -1;
    }

    public int firstUniqChar2(String s) {
        for(int i=0;i<s.length();i++) {
                if((s.lastIndexOf(s.charAt(i)) == i) && (s.indexOf(s.charAt(i)) == i))return i;
        }    
        
        return -1;
    }
}

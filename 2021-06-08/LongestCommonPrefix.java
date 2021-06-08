import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class longestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix2(new String[] {"he","hej","hea"}));
    }
	
	//Never finished version 1 but v2 works
    public static String longestCommonPrefix2(String[] strs) {
        String res = "";
        
        if(strs.length == 0){
            return res;
        }
        Queue<String> tempQue = new LinkedList<>();
        LinkedList<String> finalList = new LinkedList<>();

        for(int i = 0; i < strs[0].length(); i++){
            tempQue.add(strs[0].substring(0, i+1));
        }
        
        while (!tempQue.isEmpty()) {
            boolean match = true;
            String sl = tempQue.poll();
            for (String s : strs) {
                try{
                    if(!s.substring(0, sl.length()).equals(sl)){
                        match = false;
                        break;
                    } 
                }catch(StringIndexOutOfBoundsException e){
                    match = false;
                    break;
                }
                
            }    
            if(match == true){
                finalList.add(sl);
            }       
        }

        System.out.println(finalList.toString());
        for (String string : finalList) {
            res = (res.length() < string.length()) ? string : res;
        }

        return res;
    }
	
	public static String longestCommonPrefix(String[] strs) {     
        if(strs.length == 0){
            return "";
        }
        HashSet<String> set = new HashSet<>();

        for(int i = 0; i < strs[0].length(); i++){
            set.add(strs[0].substring(0, i));
        }
        for (String loneString : strs) {
            StringBuilder strB = new StringBuilder().append(loneString);
            for (String string : set) {
                if(strB.compareTo(string)== 0){

                }
            }
        }
        return "";
    }
    
}

import java.util.*;

public class IsValidPar {
    public static void main(String[] args) {
        System.out.println(isValid(new String("()"))); // true
        System.out.println(isValid(new String("([])"))); // true
        System.out.println(isValid(new String("([]{})"))); // true
        System.out.println(isValid(new String("([{]})"))); // false
        System.out.println(isValid(new String("({[])"))); // false
        System.out.println(isValid(new String("(([]){})"))); // true
        System.out.println(isValid(new String("({{{{{{}}}}}})"))); // true
        System.out.println(isValid(new String("({{{{{{}}}}}}))])"))); // false
    }

    private static final String oB = "([{";
    private static final String cB = ")]}";

    // Actually fast
    public static boolean isValid2(String s) {
        LinkedList<Character> list = new LinkedList<>();
 
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (isOpeningBracket(c)) {
                list.push(c);
            } else {
                if (list.isEmpty() || !isMatch(list.pop(), c)) {
                    return false;
                }
            }
        }

        return list.isEmpty();
    }

    private static boolean isOpeningBracket(char c) {
        return oB.indexOf(c) != -1;
    }

    private static boolean isMatch(char open, char close) {
        return oB.indexOf(open) == cB.indexOf(close);
    }

    //Very slow
    public static boolean isValid(String s) {


        while(s.contains("()") || s.contains("{}") || s.contains("[]")){
            s = s.replaceAll("\\(\\)", "");
            s = s.replaceAll("\\[\\]", "");
            s = s.replaceAll("\\{\\}", "");
        }

        return (s.length() > 0) ? false : true;
    }

    //Very slow2 but faster
    public static boolean isValid3(String s) {

        int l = s.length()/2;
        for(int i = 0; i < l; i++){
            s = s.replaceAll("\\(\\)", "");
            s = s.replaceAll("\\[\\]", "");
            s = s.replaceAll("\\{\\}", "");
        }

        return (s.length() > 0) ? false : true;
    }  
    
}

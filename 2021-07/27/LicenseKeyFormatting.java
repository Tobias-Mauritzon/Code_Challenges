import java.util.LinkedList;

/**
 * ou are given a license key represented as a string s that consists 
 * of only alphanumeric characters and dashes. 
 * The string is separated into n + 1 groups by n dashes. 
 * You are also given an integer k.
 * We want to reformat the string s such that each group contains exactly k characters, 
 * except for the first group, which could be shorter than k but still must 
 * contain at least one character. 
 * Furthermore, there must be a dash inserted between two groups, 
 * and you should convert all lowercase letters to uppercase.
 * Return the reformatted license key.
 */

public class LicenseKeyFormatting {

    public String licenseKeyFormatting3(String s, int k) {
        StringBuilder strB = new StringBuilder();
        int counter = 0;
        int i = s.length() - 1;
        while(i >= 0){
            char current = Character.toUpperCase(s.charAt(i));
            if(current == '-'){
                i--;
            }else if(counter != 0 && counter == k){
                strB.insert(0 , '-');
                counter = 0;
            }else{
                strB.insert(0, current);
                counter++;
                i--;
            }
        }
        return strB.toString();
    }

    public String licenseKeyFormatting2(String s, int k) {
        StringBuilder strB = new StringBuilder();
        s = s.toUpperCase();
        s = s.replace("-", "");

        int counter = 0;
        for(int i = s.length()-1; i >= 0; i--){
            strB.append(s.charAt(i));
            counter++;

            if(counter == k && i != 0){
                counter = 0;
                strB.append('-');
            }
        }

        return strB.reverse().toString();
    }

    public String licenseKeyFormatting(String s, int k) {
        LinkedList<Character> list = new LinkedList<>();
        s = s.toUpperCase();
        s = s.replace("-", "");

        int counter = 0;
        for(int i = s.length()-1; i >= 0; i--){
            
            list.addFirst(s.charAt(i));
            counter++;
            

            if(counter == k && i != 0){
                counter = 0;
                list.addFirst('-');
            }

        }

        StringBuilder strB = new StringBuilder();

        for (Character c: list) {
            strB.append(c);
        }

        return strB.toString();
    }
}

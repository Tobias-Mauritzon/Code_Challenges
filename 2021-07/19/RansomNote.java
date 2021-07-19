import java.util.Arrays;

public class RansomNote {
    /**
     * Given two stings ransomNote and magazine, return true if ransomNote can be constructed from magazine and false otherwise.
     * Each letter in magazine can only be used once in ransomNote.
     */
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] arrR = ransomNote.toCharArray();
        char[] arrM = magazine.toCharArray();

        Arrays.sort(arrM);
        Arrays.sort(arrR);

        int rCounter = 0;

        for(int i = 0; i < magazine.length() && rCounter != ransomNote.length(); i++){
            if(arrR[rCounter] == arrM[i])rCounter++;
        }

        return rCounter == ransomNote.length();
    }


    /**
     * 1 <= ransomNote.length, magazine.length <= 105
     * ransomNote and magazine consist of lowercase English letters.
     */
}

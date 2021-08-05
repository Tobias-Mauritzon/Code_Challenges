/**
 * We define the usage of capitals in a word to be right when one of the following cases holds:

        All letters in this word are capitals, like "USA".
        All letters in this word are not capitals, like "leetcode".
        Only the first letter in this word is capital, like "Google".
 * Given a string word, return true if the usage of capitals in it is right.
 */
public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        boolean capital = true;
        if(word.length() == 1)return capital;

        char[] arr = word.toCharArray();

        int rangeTop = 123;
        int rangeBottom = 96;

        if(arr[0] > 64 && arr[0] < 91 && arr[1] > 64 && arr[1] < 91){
            rangeTop = 91;
            rangeBottom = 64;
        }else if(arr[0] > 96 && arr[0] < 123 && arr[1] > 64 && arr[1] < 91)return false;
        

        for(int i = 2; i<arr.length && capital == true; i++){
            if(!(arr[i] < rangeTop && arr[i] > rangeBottom)){
                capital = false;
            }
        }

        return capital;
    }

    //like solution one but with inbuild methods
    public boolean detectCapitalUse2(String word) {
        if (word.length() < 2) return true;
        if (word.toUpperCase().equals(word)) return true;
        if (word.substring(1).toLowerCase().equals(word.substring(1))) return true;
        return false;
    }
}

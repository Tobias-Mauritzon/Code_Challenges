public class IsSubsequence {
    /**
     * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
     * A subsequence of a string is a new string that is formed from the original string by deleting some
     * (can be none) of the characters without disturbing the relative positions of the remaining characters. 
     * (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
     */

     /**
      * This method compares the length of s with the number of found characters of s
      * 
      * @param s subsequence 
      * @param t full sequence
      * @return true if s is a subsequence of t, or false otherwise
      */
    public boolean isSubsequence(String s, String t) {
        int counter = 0;
        for(int i = 0; i<t.length() && counter != s.length(); i++){
            if(s.charAt(counter) == t.charAt(i))counter++;
        }

        return counter == s.length();
    }
}

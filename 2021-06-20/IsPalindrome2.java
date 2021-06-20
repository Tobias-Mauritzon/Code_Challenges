public class IsPalindrome2 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("...asd...:/|?"));// false
        System.out.println(isPalindrome("race a car")); // false
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // true
        
    }

    //is a string a palindrome considering only alphanumeric characters and ignoring cases
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder().append(s);
        sb.reverse();
        String s2 = sb.toString();

        return s.equals(s2);
    }
}
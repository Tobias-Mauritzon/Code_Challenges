import java.util.ArrayList;
import java.util.LinkedList;

public class isPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(123));
        System.out.println(isPalindrome(1));
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(-12121));
        System.out.println(isPalindrome(12332133));
        System.out.println(isPalindrome(0));
    }

    public static boolean isPalindrome(int x) {

        LinkedList<Integer> arr = new LinkedList<>();
        x = Math.abs(x);
		
        while(x>=1){
            arr.addLast(Math.abs(x) % 10);
            x = x/10;
        }
		
        while(arr.size() > 0){          
            if(arr.size() == 1){
                return true;
            }
            else if(arr.removeFirst() != arr.removeLast()){
                return false;
            }
        }
        return true;
    }
	
	public static boolean isPalindrome2(int x) {

         if( (x % 10 == 0 && x != 0) {
            return false;
        }

        int revertedNumber = 0;
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        return x == revertedNumber || x == revertedNumber/10;
    }
}
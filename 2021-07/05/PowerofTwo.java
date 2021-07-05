
/**
 * Given an integer n, return true if it is a power of two. Otherwise, return false.
 *
 * An integer n is a power of two, if there exists an integer x such that n == 2x.
 */
public class PowerofTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(0)); // true
        System.out.println(isPowerOfTwo(1)); // true
        System.out.println(isPowerOfTwo(3)); // false
        System.out.println(isPowerOfTwo(1073741824)); // true
        System.out.println(isPowerOfTwo(-8)); // false
    }
    public static boolean isPowerOfTwo(int n) {
        int powTwo;
        for(int i = 0; i < 31; i++){   
            powTwo = 1 << i;
            if(n == powTwo)return true;
        }
        return false;
    }

    //I don't know if it's better to create the integer in the loop or not
    public static boolean isPowerOfTwo2(int n) {
        for(int i = 0; i < 31; i++){   
            int powTwo = 1 << i;
            if(n == powTwo)return true;
        }
        return false;
    }

    public boolean isPowerOfTwo3(int n) {
        return (n>0) && (n & (n-1)) == 0;
    }
    
    public boolean isPowerOfTwo4(int n) {
        while(n >= 1){
            if(n == 1 || n == 2)return true;
            if(n%2 != 0)return false;
            n = n/2;  
        }
        return false;
    }
}

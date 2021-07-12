/**
 * Given an integer n, return true if it is a power of three. Otherwise, return false.
 * An integer n is a power of three, if there exists an integer x such that n == 3x.
 * 
 */

public class PowerofThree {

    //max int val of pow 3 is 1162261467
    public boolean isPowerOfThree5(int n) {
        if (n<=0) return false;
        return 1162261467 % n == 0;
    }

    public boolean isPowerOfThree4(int n) {
        if (n < 1) return false;

        while (n % 3 == 0) n /= 3;

        if (n == 1) return true;
        return false;
    }

    public boolean isPowerOfThree2(int n) {
        double dub = n;
        while(dub != 0){
            if(dub == 1)return true;
            dub /= 3;
            if(dub%1 > 0)return false;
        }
        
        return false;
    }

    public boolean isPowerOfThree3(int n) {
        for(int i = 1; i <= n; i*=3){
            if(i == n)return true;
        }
        return false;
    }

    public boolean isPowerOfThree(int n) {
        for(int i = 0; i < n; i++){
            int num = (int)  Math.pow(3, i) ;
            if(num == n)return true;
            if(num > n)break;
            
        }
        
        return false;
    }
}

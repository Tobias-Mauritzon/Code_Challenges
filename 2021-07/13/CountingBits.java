/**
 * Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), 
 * ans[i] is the number of 1's in the binary representation of i.
 */
public class CountingBits {

  
    public static int[] countBits2(int n) {
        int arr[] = new int[n+1];
        for(int j = 0; j<=n; j++){
            arr[j] = Integer.bitCount(j);
        }
        return arr;
    }

    public static int[] countBits(int n) {
        int arr[] = new int[n+1];
        for(int j = 0; j<=n; j++){

            int counter = 0;

            for(int i = 0; i < 31; i++){
                if(((j >> i) & 1) == 1){
                    counter++;
                }
            }   

            arr[j] = counter;
        }
        return arr;
    }
    
}
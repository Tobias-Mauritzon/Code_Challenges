
// Write a function that takes an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).

public class NumberOf1Bits {
    public static void main(String[] args) {
        System.out.println(hammingWeight(3));// 2   
        System.out.println(hammingWeight(11));
        System.out.println(hammingWeight(3));
        System.out.println(hammingWeight(3));
    }
    
    public static int hammingWeight(int n) {
        int retVal = 0;
        for(int i = 0; i < 32; i++){
            int temp = n >> i;
            if((temp & 0b01) == 1){
                retVal++;
            }
        }

        return retVal;
    }
}

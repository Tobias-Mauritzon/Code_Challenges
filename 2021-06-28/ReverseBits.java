//Reverse bits of a given 32 bits unsigned integer.
public class ReverseBits {
    public static void main(String[] args) {
        System.out.println(reverseBits(43261596)); // 964176192
    }
    public static int reverseBits(int n) {
        return Integer.reverse(n);
    }
}
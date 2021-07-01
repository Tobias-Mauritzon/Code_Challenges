public class MySqrt {
    public static void main(String[] args) {
        System.out.println(mySqrt2(4)); // 2
        System.out.println(mySqrt2(9)); // 3
        System.out.println(mySqrt2(8)); // 2
        System.out.println(mySqrt2(2147395600)); // 46340
        System.out.println(mySqrt2(100)); // 10
    }

    //returns square root without using funktions or ^0.5
    public static int mySqrt2(int x) {
        long beg = 0;
        long end = x;
        long mid = 0;
        long num = -1;
        while (beg <= end) {
            mid = (int) ((beg + end) / 2);
            if (mid * mid >= x) {
                num = mid;
                end = mid - 1;
            } else
                beg = mid + 1;
        }

        return (num*num == x) ? (int) num :(int) num-1;
    }
}
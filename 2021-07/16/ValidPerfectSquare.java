
//Given a positive integer num, write a function which returns True if num is a perfect square else False.

public class ValidPerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(4));
        System.out.println(isPerfectSquare(9));
        System.out.println(isPerfectSquare(8));
    }

    public static boolean isPerfectSquare2(int num) {
        double sqrtM = Math.sqrt(num)%1;
        if(sqrtM != 0)return false;
        return true;
    }

    public static boolean isPerfectSquare(int num) {
        double sqrtM = Math.pow(num, 0.5)%1;
        if(sqrtM != 0)return false;
        return true;
    }
}

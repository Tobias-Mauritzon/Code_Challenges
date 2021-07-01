
//Ways to climb staris if you can only take 1 or 2 steps
public class ClimbStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs2(1)); // 2
        System.out.println(climbStairs2(2)); // 2
        System.out.println(climbStairs2(3)); // 3
        System.out.println(climbStairs2(4)); // 4
        System.out.println(climbStairs2(5)); // 5
        System.out.println(climbStairs2(6)); // 13
        System.out.println(climbStairs2(7)); // 21
        //System.out.println(climbStairs(5));
    }
    
    //faster way of doing it because it followed the fibonacci sequence where n5 = n4 + n3
    public static int climbStairs2(int n) {
        int num1 = 1;
        int num2 = 0;
        int num3 = 0;
        
        for(int i = 0; i < n; i++){
            num3 = num1 + num2;
            num2 = num1;
            num1 = num3;
        }

        return num3;
    }

    //Works with recursion but slow at high numbers
    public static int climbStairs(int n) {
        return rec(n, 0);
    }

    public static int rec(int n, int currentStep){
        int differentWays = 0;
        if(currentStep + 2 <= n){
            differentWays += rec(n, currentStep+2);
        }
        
        if(currentStep + 1 <= n){
            differentWays += rec(n, currentStep+1);
        }

        if(n == currentStep){
            differentWays++;
        }

        return differentWays;
    }
}

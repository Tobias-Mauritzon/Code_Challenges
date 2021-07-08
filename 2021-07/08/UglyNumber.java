/**
 * An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
 * 
 * Given an integer n, return true if n is an ugly number.
 */
public class UglyNumber {

    //This solution works and is fast but there is probably a better algorithm out there
    public boolean isUgly(int n) {

        while(n%2==0 && n != 0){
            n = n/2;
        }
        while(n%3==0 && n != 0){
            n = n/3;
        }
        while(n%5==0 && n != 0){
            n = n/5;
        }

        if(n == 1)return true;
        else return false;
    }

    public boolean isUgly2(int n) {

        while(n%2==0 && n != 0){
            n = n/2;
        }
        while(n%3==0 && n != 0){
            n = n/3;
        }
        while(n%5==0 && n != 0){
            n = n/5;
        }

       return n == 1;
    }
}

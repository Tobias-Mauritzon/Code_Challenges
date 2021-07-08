
/**
 * Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
 */
public class AddDigits {
    public static void main(String[] args) {
        System.out.println(addDigits(123) + " " +addDigits2(123));   
        int rand1 = (int) (Math.random()*100000);
        System.out.println(rand1 + " "+addDigits(rand1) + " " +addDigits2(rand1)); 
    }

    //Simple solution
    public static int addDigits(int num) {
        while(num > 9){
            int tempNum = num;
            num = 0;
            while(tempNum>0){
                int temp = tempNum%10;
                tempNum = tempNum/10;
                num += temp;
            }
        }

        return num;
    }

    //I wanted to test this and it  works. But I don't really want to do the math for it.
    public static int addDigits2(int num) {  
        while(num > 9){
           int temp = num%10;
           num = num/10;
           num += temp;
        }

        return num;
    }
    //apparently works to
    public int addDigits3(int num) {
        if (num == 0) return 0;
        if (num % 9 == 0) return 9;
        return num % 9;
    }
}

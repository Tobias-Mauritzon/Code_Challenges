
/**
 * Given a positive integer num, output its complement number. 
 * The complement strategy is to flip the bits of its binary representation.
 */
public class NumberComplement {
    public static void main(String[] args) {
        System.out.println(findComplement(5));
    }

    public static int findComplement(int num) {
        StringBuilder strB = new StringBuilder(Integer.toBinaryString(num)) ;
        for(int i = 0; i < strB.length(); i++){
            if(strB.charAt(i) == '1'){
                strB.setCharAt(i, '0');
            }else{
                strB.setCharAt(i, '1');
            }
        }
        return Integer.parseInt(strB.toString(), 2);
    }
    
}
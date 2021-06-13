public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary2("11", "1")); // ans 100
        System.out.println(addBinary2("1010", "1011")); // ans 10101
        System.out.println(addBinary2("1010", "")); // ans 1010
        System.out.println(addBinary2("0", "0")); // ans 0
        System.out.println(addBinary2("1", "1")); // ans 10
    }
    
    //Binary addition of two strings with binary numbers
    public static String addBinary(String a, String b) {

        StringBuilder str = new StringBuilder();
        short carry = 0;
        int aLen = a.length();
        int bLen = b.length();

        while(Math.max(aLen, bLen) > 0){
            int val = 0;

             if(aLen < 1){
                val = Integer.parseInt(b.substring(bLen-1, bLen)) + carry;
             }else if(bLen < 1){
                val = Integer.parseInt(a.substring(aLen-1, aLen)) + carry;
             }else{
                val = Integer.parseInt(b.substring(bLen-1, bLen)) + Integer.parseInt(a.substring(aLen-1, aLen)) + carry;
             }

             if(val == 3){
                str.append("1");
                carry = 1;
             }else if(val == 2){
                str.append("0");
                carry = 1;
             }else{
                 str.append(""+val);
                 carry = 0;
             }
             aLen--;
             bLen--;           
        }

        if(carry == 1){
            str.append(carry);
        }

        return str.reverse().toString();
    }

    //Using charAt instead of substring for binary addition
    public static String addBinary2(String a, String b) {

        StringBuilder str = new StringBuilder();
        byte carry = 0;
        int aLen = a.length();
        int bLen = b.length();

        while(Math.max(aLen, bLen) > 0){
            byte val = 0;

             if(aLen < 1){
                val = Integer.parseInt(String.valueOf(b.charAt(bLen-1))) + carry;
             }else if(bLen < 1){
                val = Integer.parseInt(String.valueOf(a.charAt(aLen-1))) + carry;
             }else{
                val = Integer.parseInt(String.valueOf(b.charAt(bLen-1))) + Integer.parseInt(String.valueOf(a.charAt(aLen-1))) + carry;
             }

             if(val == 3){
                str.append("1");
                carry = 1;
             }else if(val == 2){
                str.append("0");
                carry = 1;
             }else{
                 str.append(""+val);
                 carry = 0;
             }
             aLen--;
             bLen--;           
        }

        if(carry == 1){
            str.append(carry);
        }

        return str.reverse().toString();
    }

    //Could be done faster with recursion
}

public class reverse {
    
    public static void main(String[] args) {
        System.out.println(reverse2(123));
        System.out.println(reverse2(4));
        System.out.println(reverse2(10));
        System.out.println(reverse2(-200));
        System.out.println(reverse2(2147483647));
    }
    
	// Before i knew stringbuilder had reverse
    public static int reverse(int x) {

        String str = Integer.toString(x);
        
        if(str.length() == 1){
            return x;
        }else{
            while(str.lastIndexOf("0") == str.length()-1){
                str = str.substring(0, str.length()-1);
            }
        }
        
        str = str.replace("-", "");
        byte[] strAsByteArray = str.getBytes();
        byte[] result = new byte[strAsByteArray.length];

        for (int i = 0; i < strAsByteArray.length; i++){
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
        }

        if(x < 0){
            if (-Long.parseLong(new String(result)) < -2147483648 ) {
                return 0;
            }else{
                x = -Integer.parseInt(new String(result));
            }
        }else{
            if (2147483647 < Long.parseLong(new String(result))) {
                return 0;
            }else{
                x = Integer.parseInt(new String(result));
            }
        }

        return x;
    }

    public static int reverse2(int x) {
        String reversed = new StringBuilder().append(Math.abs(x)).reverse().toString();
        try {
			if(x < 0){
				return Integer.parseInt(reversed) * -1;
			}else{
				return Integer.parseInt(reversed);
			}
            
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
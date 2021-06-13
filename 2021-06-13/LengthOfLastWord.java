public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord2("Hello World"));
        System.out.println(lengthOfLastWord2("hej"));
        System.out.println(lengthOfLastWord2("a "));
        System.out.println(lengthOfLastWord2("a as "));
        System.out.println(lengthOfLastWord2("      "));
        
    }

    //finds last word in string and returns the length
    public static int lengthOfLastWord2(String s) {

        if(s.equals(" "))return 0;
        String arr[] = s.split(" ");
        try{
            return arr[arr.length-1].length();
        }catch(ArrayIndexOutOfBoundsException e){
            return 0;
        }
    }

    //finds last word in string and returns the length but it does not work for "      " or "asd     "
    public static int lengthOfLastWord(String s) {
        if(s.equals(" "))return 0;
        int len = s.length();
        boolean isLast = false;

        if(s.charAt(len -1) == Character.valueOf(' ')) len = len -1;

        for(int i = len-1; i > -1; i--){
            if(s.charAt(i) == Character.valueOf(' ') && isLast == false){
                len = s.length() - i -1;
                break;
            }

        }
        return len;
    }

}

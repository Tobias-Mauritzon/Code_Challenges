public class StrStr {
    public static void main(String[] args) {
        System.out.println(strStr("eeeeeeeeeeeell","ll"));
        System.out.println(strStr("eeeeeeeeeellee","ll"));
        System.out.println(strStr("lelleeeeeellee","ll"));
    }

    //We are not allowed to use indexOf
    public static int strStr(String haystack, String needle) {
        if(needle.length() == 0)return 0;
        int res = -1;

        int len = needle.length();
        for(int i = 0; i+len-1 < haystack.length(); i++){
            if(needle.equals(haystack.substring(i,i+len))){
                res = i;
                break;
            }
        }


        return res;
    }

}
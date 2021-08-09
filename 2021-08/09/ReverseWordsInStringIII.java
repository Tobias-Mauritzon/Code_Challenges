public class ReverseWordsInStringIII {

    public String reverseWords3(String s) {
        StringBuilder reverse = new StringBuilder(s);
        String[] arr = reverse.reverse().toString().split(" ");
        reverse = new StringBuilder();
        for(int i = arr.length-1; i >= 0; i--){
            reverse.append(arr[i]+" ");
        }

        return reverse.toString().trim();
    }

    public String reverseWords2(String s) {
        StringBuilder reverse = new StringBuilder(s);
        String[] arr = reverse.reverse().toString().split(" ");
        reverse = new StringBuilder();
        for(int i = arr.length-1; i > 0; i--){
            reverse.append(arr[i]+" ");
        }
        reverse.append(arr[0]);

        return reverse.toString();
    }

    public String reverseWords(String s) {
        StringBuilder ret = new StringBuilder();
        StringBuilder reverse = new StringBuilder();
        for(char c :  s.toCharArray()){
            if(c != ' '){
                reverse.append(c);
            }else{
                reverse.reverse();
                reverse.append(' ');
                ret.append(reverse);
                reverse = new StringBuilder();
            }
        }

        reverse.reverse();    
        ret.append(reverse);

        return ret.toString();
    }
}

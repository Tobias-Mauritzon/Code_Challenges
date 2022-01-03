public class RobotReturntoOrigin {
    
    public static void main(String[] args) {
        boolean b = judgeCircle2("UDL");
        System.out.println(b);
    }
    
    public static boolean judgeCircle(String moves) {
    int left = 0;
    int up = 0;
    for(int i = 0; i<moves.length();i++){
        if(moves.charAt(i) == 'L'){
            left++;
        }else if(moves.charAt(i) == 'R'){
            left--;
        }
        else if(moves.charAt(i) == 'U'){
            up++;
        }else{
            up--;
        }
    }

    return left == 0 & up == 0;
    }

    public static boolean judgeCircle2(String moves) {
        int left = 0;
        int up = 0;
        for(char c : moves.toCharArray()){
            if(c == 'L'){
                left++;
            }else if(c == 'R'){
                left--;
            }
            else if(c == 'U'){
                up++;
            }else{
                up--;
            }
        }
    
        return left == 0 & up == 0;
        }
}

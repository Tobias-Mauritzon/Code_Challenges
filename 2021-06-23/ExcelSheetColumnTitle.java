import java.util.LinkedList;

//Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        System.out.println(convertToTitle2(1)); // A
        System.out.println(convertToTitle2(28)); // AB
        System.out.println(convertToTitle2(701)); // ZY
        System.out.println(convertToTitle2(2147483647)); // FXSHRXW
        System.out.println(convertToTitle2(123243)); // FZHC
    }

    //whitout list
    public static String convertToTitle3(int columnNumber) {
        String ret = "";
        String arr[] = {"0", "A", "B","C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        while(columnNumber > 0){
            int temp = (columnNumber % 26);

            columnNumber = columnNumber/26;
            if(temp == 0){
                ret = arr[26] + ret;
                columnNumber--;
            }else{
                ret = arr[temp] + ret;
            }
        }
        return ret;
    }


    public static String convertToTitle2(int columnNumber) {
        String ret = "";
        String arr[] = {"0", "A", "B","C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        LinkedList<String> list = new LinkedList<>();

        while(columnNumber > 0){
            int temp = (columnNumber % 26);

            columnNumber = columnNumber/26;
            if(temp == 0){
                list.addFirst(arr[26]);
                columnNumber--;
            }else{
                list.addFirst(arr[temp]);
            }
        }

        for (String string : list) {
            ret = ret + string;
        }
        return ret;
    }

    //did not work for all tests
    public static String convertToTitle(int columnNumber) {
        String ret = "";
        String arr[] = {"0","A", "B","C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        int i = 0;
        while(columnNumber>0){
            double temp = (Math.pow(26, i) < 1) ? 0 : Math.pow(26, i);

            for(int times = 1; times < 28; times++){
                if(times * temp > columnNumber){
                    times--;
                    System.out.println(i + " "+ times);
                    ret = ret + arr[times];
                    columnNumber = (int) (columnNumber - times*temp);
                    i = -1;
                    break;
                }
                
            }
            
            i++;
        }
        return ret;
    }

    
}

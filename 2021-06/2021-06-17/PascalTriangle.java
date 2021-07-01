import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    //Generates a pascal Triangle with n rows
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> list = new ArrayList<>();

        if(numRows == 0)return list;
        for(int i = 0; i < numRows; i++){
            List<Integer> innerL = new ArrayList<>();

            if(i == 0){
                innerL.add(1);
            }else if(i == 1){
                innerL.add(1);
                innerL.add(1);
            }else{
                List<Integer> prevList = list.get(i-1);
                for(int j = 0; j <= i; j++){
                    
                    if(j == 0 || j == i){
                        innerL.add(1);
                    }
                    else{
                        innerL.add(prevList.get(j-1)+prevList.get(j));
                    }
                }
            }
            list.add(innerL);
        }

        return list;
    }
}
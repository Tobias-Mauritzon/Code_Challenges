import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {
    //Generates a pascal Triangle and returns the row of rowIndex
    public List<Integer> getRow(int rowIndex) {

        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0; i <= rowIndex; i++){
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

        return list.get(rowIndex);
    }
}
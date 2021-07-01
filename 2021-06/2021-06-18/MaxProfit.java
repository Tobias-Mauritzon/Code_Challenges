import java.util.LinkedList;

//Stock trading maxprofit
//don't look back in array
public class MaxProfit {

    public static void main(String[] args) {
        System.out.println( maxProfit5(new int[]{10, 9, 20, 10 ,22})); // 13
    }


    class Val{
        int val;
        int index;

        Val(int val){
            this.val = val;
        }
    }

    //Actual good dolution
    public static int maxProfit5(int[] prices)
    {
        int prof;
        int min=prices[0];
        int max=prices[0];
        prof=max-min;
        for(int i=1;i<prices.length;i++){
            if(min>prices[i]){
                min=prices[i];
                max=min;
            }

            if(max<prices[i]){
                max=prices[i];
                prof= Math.max(prof, max-min);
            }
        }
        return prof;
    }

    public int maxProfit4(int[] prices) {

        Val valSmall = new Val(10000);
        Val valBigg = new Val(0);

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < valSmall.val){
                valSmall.val = prices[i];
                valSmall.index = i;
            }
            if(prices[i] > valBigg.val){
                valBigg.val = prices[i];
                valBigg.index = i;
            }
        }
        if(valSmall.index < valBigg.index)return valBigg.val - valSmall.val;

        int maxProf = 0;

        

        return maxProf;
    }

    // works and i think it is faster than maxProgit2
    public int maxProfit3(int[] prices) {

        LinkedList<Integer> list = new LinkedList<>();

        // find first smallest 

        int smallIndex = 0;
        while(smallIndex < prices.length-1){

            if(prices[smallIndex] < prices[smallIndex+1]){
                break;
            }
            smallIndex++;
        }  


        // find last biggest
        int biggIndex = prices.length-1;
        while(biggIndex > smallIndex){

            if(prices[biggIndex] > prices[biggIndex-1]){
                break;
            }
            biggIndex--;
        }

        for(int i = smallIndex; i <= biggIndex; i++){
            if(prices[i] < prices[smallIndex] || prices[i] > prices[biggIndex]){
                list.addLast(prices[i]);
            }
        }

        list.addFirst(prices[smallIndex]);
        list.addLast(prices[biggIndex]);


        int maxProf = 0;
        for(int i = 0; i < list.size(); i++){
            for(int j = i+1; j < list.size(); j++){
                maxProf = Math.max(maxProf, list.get(j) - list.get(i));
            }
        } 

        return maxProf;
    }

    //Working solution but slow for large arrays
    public int maxProfit2(int[] prices) {

        // find first smallest 
        // find last biggeset

        int maxProf = 0;
        for(int i = 0; i < prices.length; i++){
            for(int j = i+1; j < prices.length; j++){
                maxProf = Math.max(maxProf, prices[j] - prices[i]);
            }
        } 

        return maxProf;
    }

    public int maxProfit(int[] prices) {
        int i = 1;
        while(i < prices.length){

            if(prices[i-1] < prices[i]){

            }

            i++;
        }  
        return 0; 
    }
}

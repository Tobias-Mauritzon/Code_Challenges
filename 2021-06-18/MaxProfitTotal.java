public class MaxProfitTotal {
    
    public static void main(String[] args) {
        System.out.println( maxProfitTotal(new int[]{10, 9, 20, 10 ,22})); // 13
        System.out.println( maxProfitTotal(new int[]{7,1,5,3,6,4})); // 7
        System.out.println( maxProfitTotal(new int[]{1,2,3,4,5})); // 4
        System.out.println( maxProfitTotal(new int[]{7,6,4,3,1})); // 0
    }
    
    //Actual good dolution
    public static int maxProfitTotal(int[] prices)
    {
        int totalProf = 0;
        for(int i=1;i<prices.length;i++){
            totalProf += Math.max(0, prices[i] - prices[i-1]);
        }   
        return totalProf;
    }

    //Modification of maxProfit
    public static int maxProfitTotal2(int[] prices)
    {
        int totalProf = 0;
        int prof;
        int min=prices[0];
        int max=prices[0];
        prof=max-min;
        boolean counted = true;
        for(int i=1;i<prices.length;i++){
            if(min>prices[i]){
                min=prices[i];
                max=min;
            }

            if(max<prices[i]){
                max=prices[i];
                prof= Math.max(prof, max-min);
                counted = false;

            }else{
                totalProf += prof;
                prof = 0;
                min = prices[i];
                max = 0;
                counted = true;
            }
        }
        if(!counted)totalProf += prof;
        return totalProf;
    }

    

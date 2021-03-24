class Solution {
    public int distributeCandies(int[] candyType) {
        //divide array for num of candies
        //get number of types
        //return the smaller of types and array length
        
        int len = candyType.length/2;
        
        Set<Integer> hash_Set = new HashSet<Integer>();
        for(int can : candyType){
            hash_Set.add(can);
        }
        int cantype = hash_Set.size();
        if(cantype < len){
            return cantype;
        }else{
            return len;
        }
    }
}
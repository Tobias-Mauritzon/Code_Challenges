class Solution {
public:
    int distributeCandies(vector<int>& candyType) {
        int length = candyType.size()/2;
        set<int> s1;
        
        for(int can : candyType){
            s1.insert(can);
        }
        
        int canSize = s1.size();
        
        if(canSize < length){
            return canSize;
        }else{
            return length;
        }
        
    }
};
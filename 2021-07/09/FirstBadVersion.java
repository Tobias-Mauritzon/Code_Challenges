
/**
 * You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. 
 * 
 * Since each version is developed based on the previous version, all the versions after a bad version are also bad.
 * 
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad. 
 * 
 * You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.
 */
public class FirstBadVersion {
    //The isBadVersion API is defined in the parent class VersionControl.
    //Not how it actually works
    boolean isBadVersion(int version){
        return false;
    }

    //Binary search solution
    //it is v3 because i really didn't want to google it
    public int firstBadVersion3(int n) {
        int low = 1, high = n;
        int ans = 0;
        while (low<=high){
            int mid = low + (high-low)/2;
            if (isBadVersion(mid)){
                high = mid-1; 
                ans = mid;
            }
            else low = mid+1;
        }
        return ans;
    }

    public int firstBadVersion(int n) {
        int retVal = 0;
        if(isBadVersion(n))retVal = firstBadVersion(n-1);
        else return n+1;
        
        return retVal;
    }

    public int firstBadVersion2(int n) {
        int retVal = 0;
        
        for(int i = n; i >= 0; i--){
            if(!isBadVersion(i)){
                retVal = i+1;
                break;
            } 
        }
        
        return retVal;
    }

    
}

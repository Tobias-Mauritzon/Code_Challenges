/**
 * We are playing the Guess Game. The game is as follows:
 * I pick a number from 1 to n. You have to guess which number I picked.
 * Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.
 * 
 * You call a pre-defined API int guess(int num), which returns 3 possible results:
 *      -1: The number I picked is lower than your guess (i.e. pick < num).
 *      1: The number I picked is higher than your guess (i.e. pick > num).
 *      0: The number I picked is equal to your guess (i.e. pick == num).
 * Return the number that I picked.
 */
public class GuessNumberHigherOrLower {

    
    int guess(int num){
        return 1;
    }

    //binary search solution with the given api
    public int guessNumber(int n) {
        int l = 0, r = n;
        while (l <= r) {
            int m = l + (r - l) / 2;
  
            // Check if x is present at mid
            if (guess(m) == 0)
                return m;
  
            // If x greater, ignore left half
            if (guess(m) == 1)
                l = m + 1;
  
            // If x is smaller, ignore right half
            else
                r = m - 1;
        }
  
        // if we reach here, then element was
        // not present
        return -1;
    }
}

import java.util.*;



/**
 * You are given an integer array score of size n, where score[i] is the score of the ith athlete in a competition. All the scores are guaranteed to be unique.

The athletes are placed based on their scores, where the 1st place athlete has the highest score, the 2nd place athlete has the 2nd highest score, and so on. The placement of each athlete determines their rank:

    The 1st place athlete's rank is "Gold Medal".
    The 2nd place athlete's rank is "Silver Medal".
    The 3rd place athlete's rank is "Bronze Medal".
For the 4th place to the nth place athlete, their rank is their placement number (i.e., the xth place athlete's rank is "x").
Return an array answer of size n where answer[i] is the rank of the ith athlete.
 */

public class RelativeRanks {
    public String[] findRelativeRanks(int[] score) {
        String[] placements = new String[score.length];

        //hashMap for faster lookups
        HashMap<Integer, Integer> map = new HashMap<>();

        //for placement order
        int[] arr2 = new int[score.length];

        for(int i = 0; i<score.length; i++){
            arr2[i] = score[i];
        }

        for(int i = 0; i < score.length; i++){
            map.put(score[i], i);
        }

        Arrays.sort(arr2);

        int place = 1;
        for(int i = score.length-1; i >= 0; i--){

            int index = map.get(arr2[i]);

            if(place == 1){
                placements[index] = "Gold Medal";
            }else if(place == 2){
                placements[index] = "Silver Medal";
            }else if(place == 3){
                placements[index] = "Bronze Medal";
            }else{
                placements[index] = Integer.toString(place);
            }
            place++;
        }

        return placements;
    }
}
/**
 * Constraints:

    n == score.length
    1 <= n <= 104
    0 <= score[i] <= 106
    All the values in score are unique.
 */

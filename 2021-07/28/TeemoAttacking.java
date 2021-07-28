/**
 * Our hero Teemo is attacking an enemy Ashe with poison attacks! 
 * When Teemo attacks Ashe, Ashe gets poisoned for a exactly duration seconds. 
 * More formally, an attack at second t will mean Ashe is 
 * poisoned during the inclusive time interval [t, t + duration - 1]. 
 * If Teemo attacks again before the poison effect ends, 
 * the timer for it is reset, 
 * and the poison effect will end duration seconds after the new attack.
 * 
 * You are given a non-decreasing integer array timeSeries, 
 * where timeSeries[i] denotes that Teemo attacks Ashe at second timeSeries[i], 
 * and an integer duration.
 * 
 * Return the total number of seconds that Ashe is poisoned.
 */
public class TeemoAttacking {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int time = 0;
        for(int i = 0; i<timeSeries.length; i++){
            if(i == timeSeries.length-1){
                time += duration;
            }else{
                int tempT = timeSeries[i] + duration;
                time += duration;
                if(tempT - timeSeries[i+1] > 0){
                    time -= tempT - timeSeries[i+1];
                }
            }
        }   
        return time;
    }
}

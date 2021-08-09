/**
 * You are given a string s representing an attendance record for a student where each character signifies whether the student was absent, 
 * late, or present on that day. The record only contains the following three characters:

        'A': Absent.
        'L': Late.
        'P': Present.
    The student is eligible for an attendance award if they meet both of the following criteria:

        The student was absent ('A') for strictly fewer than 2 days total.
        The student was never late ('L') for 3 or more consecutive days.
    Return true if the student is eligible for an attendance award, or false otherwise
 */
public class StudentAttendanceRecordI {
    public boolean checkRecord(String s) {
         char[] arr = s.toCharArray();

         int late = 0;
         int absent = 0;

         for(int i = 0; i < arr.length && absent < 2 && late < 3; i++){
            if(arr[i] == 'A'){
                absent++;
                late = 0;
            }else if(arr[i] == 'L'){
                late++;
            }else{
                late = 0;
            }        
        }
        return late < 3 && absent < 2;
    }

    //worse time complexity but better space complexity
    public boolean checkRecord2(String s) {
        return !s.matches(".*LLL.*|.*A.*A.*");
    }
}
/**
 * Constraints:

    1 <= s.length <= 1000
    s[i] is either 'A', 'L', or 'P'.
 */

import java.util.*;

class Solution {
    public int countDays(int days, int[][] meetings) {
  
        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);

        int covered = 0;
        int start = meetings[0][0];
        int end = meetings[0][1];


        for (int i = 1; i < meetings.length; i++) {
            if (meetings[i][0] <= end) {
         
                end = Math.max(end, meetings[i][1]);
            } else {
               
                covered += (end - start + 1);
                start = meetings[i][0];
                end = meetings[i][1];
            }
        }
       
        covered += (end - start + 1);

     
        return days - covered;
    }
}

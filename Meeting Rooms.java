/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        int n = intervals.size();
        if(n == 0) return true;

        Collections.sort(intervals, (a,b) -> a.start - b.start);

        for(int i=0; i < n-1; i++){
            if((intervals.get(i).end - intervals.get(i+1).start) > 0){
                return false;
            }
        }
        return true;
    }
}

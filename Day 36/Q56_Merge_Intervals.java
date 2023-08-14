/*
 * Problem Link : https://leetcode.com/problems/merge-intervals/
 * Solution Link : https://www.youtube.com/watch?v=2JzRBPFYbKE
 *
 * Time Complexity : O(N log N)
 * Space Complexity : O(1)
 */

class Q56_Merge_Intervals
{
    public int[][] merge(int[][] intervals)
    {
        List<int []> result = new ArrayList<int []>();

        Arrays.sort(intervals, (a,b)->a[0] - b[0]);
        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int interval[] : intervals)
        {
            if(interval[0] <= end)
                end = Math.max(end, interval[1]);
            else
            {
                result.add(new int[]{start, end});
                start = interval[0];
                end = interval[1];
            }
        }

        result.add(new int[]{start, end});
        return result.toArray(new int[0][]);
    }
}

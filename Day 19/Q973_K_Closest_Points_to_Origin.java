/*
 * Problem Link : https://leetcode.com/problems/k-closest-points-to-origin/
 * Solution Link : https://leetcode.com/problems/k-closest-points-to-origin/solutions/1507637/java-solution-using-priorityqueue/
 *
 * Time Complexity : O(N log N)
 * Space Complexity : O(N)
 */

class Q973_K_Closest_Points_to_Origin 
{
    public int[][] kClosest(int[][] points, int k) 
    {
        PriorityQueue<int []> queue = new PriorityQueue<int []>((a,b) -> a[0]*a[0] + a[1]*a[1] - b[0]*b[0] - b[1]*b[1]);

        for(int point[] : points)
            queue.add(point);

        int result[][] = new int[k][2];
        int index=0;
        while(index<k)
            result[index++] = queue.poll();

        return result;
    }
}

/*
 * Problem Link : https://leetcode.com/problems/climbing-stairs/
 * Solution Link : https://leetcode.com/problems/climbing-stairs/solutions/963994/java-from-recursion-to-dp/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

class Q70_Climbing_Stairs 
{
    public int climbStairs(int n) 
    {
        if(n <= 2)
            return n;

        int a = 1;
        int b = 2;

        for(int index=3 ; index<=n ; index++)
        {
            int c = a + b;
            a = b;
            b = c;
        }
        
        return b;
    }
}

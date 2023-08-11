/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

/*
 * Problem Link : https://leetcode.com/problems/first-bad-version/
 * Solution Link : https://leetcode.com/problems/first-bad-version/solutions/2575109/java-4-lines-code-log-n-time-space-o-1-binary-search/
 */

public class Q278_First_Bad_Version extends VersionControl 
{
    public int firstBadVersion(int n) 
    {
        int left = 1;
        int right = n;
        int answer = -1;

        while(left <= right)
        {
            int mid = left + (right - left)/2;

            if(isBadVersion(mid))
            {
                answer = mid;
                right = mid - 1;
            }
            else
                left = mid + 1;
        }

        return answer;
    }
}

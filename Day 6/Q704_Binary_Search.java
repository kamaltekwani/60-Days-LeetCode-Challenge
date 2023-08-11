/*
 * Problem Link : https://leetcode.com/problems/binary-search/
 * Solution Link : https://leetcode.com/problems/binary-search/solutions/3363885/easy-solutions-in-java-python-and-c-look-at-once-with-exaplanation/
 *
 * Time Complexity : O(log N)
 * Space Complexity : O(1)
 */

class Q704_Binary_Search 
{
    public int search(int[] nums, int target) 
    {
        int left = 0;
        int right = nums.length-1;

        while(left <= right)
        {
            int mid = left + (right - left)/2;

            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
                left = mid+1;
            else
                right = mid-1;
        }
        
        return -1;
    }
}

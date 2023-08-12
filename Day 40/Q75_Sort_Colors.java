/*
 * Problem Link : https://leetcode.com/problems/sort-colors/
 * Solution Link : https://leetcode.com/problems/sort-colors/solutions/3164333/solution/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

class Q75_Sort_Colors
{
    public void swap(int nums[], int left, int right)
    {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    public void sortColors(int[] nums) 
    {
        int left = 0;
        int mid = 0;
        int right = nums.length-1;

        while(mid <= right)
        {
            if(nums[mid] == 0)
            {
               swap(nums, left, mid);
               left++;
               mid++;
            }
            else if(nums[mid] == 1)
            {
                mid++;
            }
            else if(nums[mid] == 2)
            {
                swap(nums, mid, right);
                right--;
            }
        }
    }
}

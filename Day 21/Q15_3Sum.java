/*
 * Problem Link : https://leetcode.com/problems/3sum/
 * Solution Link : https://leetcode.com/problems/3sum/solutions/3736346/java-easiest-solution-ever/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */


class Q15_3Sum 
{
    public List<List<Integer>> threeSum(int[] nums)
    {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        for(int index=0 ; index<nums.length ; index++)
        {
            if(index == 0 || nums[index-1] != nums[index])
            {
                int j = index+1;
                int k = nums.length-1;

                int target = -nums[index];

                while(j < k)
                {
                    if(nums[j] + nums[k] == target)
                    {
                        result.add(Arrays.asList(nums[index], nums[j], nums[k]));

                        while(j<k && nums[j] == nums[j+1])
                            j++;

                        while(j<k && nums[k-1] == nums[k])
                            k--;

                        j++;
                        k--;
                    }
                    else if(nums[j] + nums[k] < target)
                        j++;
                    else
                        k--;
                }
            }
        }
        
        return result;
    }
}

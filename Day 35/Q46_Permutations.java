/*
 * Problem Link : https://leetcode.com/problems/permutations/
 * Solution Link : https://www.youtube.com/watch?v=R3Sm9V2OSCo
 *
 * Time Complexity : 
 * Space Complexity : 
 */

class Q46_Permutations 
{
    public void findPermutation(int nums[], List<Integer> list, List<List<Integer>> result, boolean visited[])
    {
        if(list.size() == nums.length)
        {
            result.add(new ArrayList<Integer>(list));
            return;
        }

        for(int index=0 ; index<nums.length ; index++)
        {
            if(visited[index])
                continue;

            list.add(nums[index]);
            visited[index] = true;
            findPermutation(nums, list, result, visited);
            list.remove(list.size()-1);
            visited[index] = false;
        }
    }

    public List<List<Integer>> permute(int[] nums) 
    {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        boolean visited[] = new boolean[nums.length];
        findPermutation(nums, list, result, visited);
        return result;
    }
}

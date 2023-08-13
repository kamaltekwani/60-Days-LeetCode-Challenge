/*
 * Problem Link : https://leetcode.com/problems/product-of-array-except-self/
 * Solution Link : https://leetcode.com/problems/product-of-array-except-self/solutions/1599115/238-product-of-array-except-self-java-solution/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

class Q238_Product_of_Array_Except_Self
{
    public int[] productExceptSelf(int[] nums) 
    {
        int result[] = new int[nums.length];
        Arrays.fill(result, 1);
        int left = 1;
        int right = 1;

        for(int index=0 ; index<nums.length ; index++)
        {
            result[index] *= left;
            left *= nums[index];
        }

        for(int index=nums.length-1 ; index>=0 ; index--)
        {
            result[index] *= right;
            right *= nums[index];
        }

        return result;
    }
}

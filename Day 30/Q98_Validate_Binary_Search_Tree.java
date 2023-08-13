/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

/*
 * Problem Link : https://leetcode.com/problems/validate-binary-search-tree/description/
 * Solution Link : https://leetcode.com/problems/validate-binary-search-tree/solutions/32109/my-simple-java-solution-in-3-lines/
 * Time Complexity : 
 * Space Complexity : 
 */

class Q98_Validate_Binary_Search_Tree 
{
    public boolean validateBST(TreeNode root, long min, long max)
    {
        if(root == null)
            return true;

        if(min >= root.val || root.val >= max)
            return false;

        return validateBST(root.left, min, root.val) && validateBST(root.right, root.val, max);
    }

    public boolean isValidBST(TreeNode root) 
    {
        return validateBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}

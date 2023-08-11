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
 * Problem Link : https://leetcode.com/problems/balanced-binary-tree/description/
 * Solution Link : https://leetcode.com/problems/balanced-binary-tree/solutions/35943/java-o-n-solution-based-on-maximum-depth-of-binary-tree/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */


class Q110_Balanced_Binary_Tree
{
    public int isTreeBalanced(TreeNode root)
    {
        if(root == null)
            return 0;

        int left = isTreeBalanced(root.left);
        if(left == -1)
            return -1;

        int right = isTreeBalanced(root.right);
        if(right == -1)
            return -1;

        if(Math.abs(right - left) > 1)
            return -1;

        return 1 + Math.max(left, right);
    }

    public boolean isBalanced(TreeNode root) {
        return isTreeBalanced(root) != -1;
    }
}

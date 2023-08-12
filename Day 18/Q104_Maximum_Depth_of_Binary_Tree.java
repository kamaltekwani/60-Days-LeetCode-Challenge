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
 * Problem Link : https://leetcode.com/problems/maximum-depth-of-binary-tree/
 * Solution Link : https://leetcode.com/problems/maximum-depth-of-binary-tree/solutions/1769344/java-c-easy-to-go-explanation-solution/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

class Q104_Maximum_Depth_of_Binary_Tree 
{
    public int maxDepth(TreeNode root) 
    {
        if(root == null)
            return 0;

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return 1 + Math.max(leftDepth, rightDepth);
    }
}

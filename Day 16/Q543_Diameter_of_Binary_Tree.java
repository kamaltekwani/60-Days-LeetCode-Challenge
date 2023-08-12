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
 * Problem Link : https://leetcode.com/problems/diameter-of-binary-tree/
 * Solution Link : https://leetcode.com/problems/diameter-of-binary-tree/solutions/1039281/3-java-solutions-with-explanation-o-n-100-fast/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

class Q543_Diameter_of_Binary_Tree
{
    int diameter=0;

    public int findDiameter(TreeNode root)
    {
        if(root == null)
            return 0;

        int leftHeight = findDiameter(root.left);
        int rightHeight = findDiameter(root.right);

        diameter = Math.max(diameter, leftHeight + rightHeight);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null)
            return 0;
        findDiameter(root);
        return diameter;
    }
}

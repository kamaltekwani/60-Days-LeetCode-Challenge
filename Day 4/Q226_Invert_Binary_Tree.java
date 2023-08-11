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
 * Problem Link : https://leetcode.com/problems/invert-binary-tree/
 * Solution Link : https://leetcode.com/problems/invert-binary-tree/solutions/2463600/easy-100-fully-explained-java-c-python-js-c-python3-recursive-iterative/
 */

class Q226_Invert_Binary_Tree 
{
    public TreeNode invertTree(TreeNode root) 
    {
        if(root == null)
            return root;

        invertTree(root.left);
        invertTree(root.right);

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        return root;
    }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

/*
 * Problem Link : https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
 * Solution Link : https://www.youtube.com/watch?v=WRAJ8Q9bICM
 *
 * Time Complexity :
 * Space Complexity : O(1)
 */

class Q236_Lowest_Common_Ancestor_of_a_Binary_Tree
 
{
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
    {
        if(root == null)
            return root;

        if(root == p || root == q)
            return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left != null && right != null)
            return root;
        
        if(left != null)
            return left;
        else
            return right;
    }
}

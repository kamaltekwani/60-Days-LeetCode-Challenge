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
 * Problem Link : https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 * Solution Link : https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/solutions/64955/clear-java-10-ms/
 *
 * Time Complexity : O(log N)
 * Space Complexity : O(1)
 */



class Q235_Lowest_Common_Ancestor_of_a_Binary_Search_Tree 
{
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
    {
        if(root == null)
            return null;

        if(p.val < root.val && q.val < root.val)
            return lowestCommonAncestor(root.left, p, q);
        else if(p.val > root.val && q.val > root.val)
            return lowestCommonAncestor(root.right, p, q);
        else 
            return root;
    }
}

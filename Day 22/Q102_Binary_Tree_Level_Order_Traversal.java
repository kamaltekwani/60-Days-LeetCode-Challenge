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
 * Problem Link : https://leetcode.com/problems/binary-tree-level-order-traversal/
 * Solution Link : https://leetcode.com/problems/binary-tree-level-order-traversal/solutions/33450/java-solution-with-a-queue-used/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

class Q102_Binary_Tree_Level_Order_Traversal
{
    public List<List<Integer>> levelOrder(TreeNode root) 
    {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if(root == null)
            return result;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        while(!queue.isEmpty())
        {
            int size = queue.size();

            List<Integer> list = new ArrayList<Integer>();

            while(size-- > 0)
            {
                TreeNode current = queue.poll();

                if(current.left != null)
                    queue.add(current.left);

                if(current.right != null)
                    queue.add(current.right);

                list.add(current.val);
            }
            result.add(list);
        }

        return result;
    }
}

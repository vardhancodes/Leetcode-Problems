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
class Solution {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        int leftmost = 0;
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int levelsize = queue.size();
            boolean found = false;
            for(int i = 0 ; i < levelsize ; i++)
            {
                TreeNode node = queue.poll();
                if(!found)
                {
                    leftmost = node.val;
                    found = true;
                }
                if(node.left != null)
                {
                    queue.offer(node.left);
                }
                if(node.right != null)
                {
                    queue.offer(node.right);
                }
            }
        }
        return leftmost;

    }

}
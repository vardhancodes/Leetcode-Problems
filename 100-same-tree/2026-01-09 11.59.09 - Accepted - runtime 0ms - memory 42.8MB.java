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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> queuep = new LinkedList<>();
        Queue<TreeNode> queueq = new LinkedList<>();
        queuep.offer(p);
        queueq.offer(q);
        while(!queuep.isEmpty() || !queueq.isEmpty())
        {
            TreeNode nodep = queuep.poll();
            TreeNode nodeq = queueq.poll();
            if(nodep == null && nodeq == null)
            {
                continue;
            }
            if(nodep == null || nodeq == null)
            {
                return false;
            }
            if(nodep.val != nodeq.val)
            {
                return false;
            }
            queuep.offer(nodep.left);
            queuep.offer(nodep.right);
            queueq.offer(nodeq.left);
            queueq.offer(nodeq.right);
        
        }
        if(!queuep.isEmpty() || !queueq.isEmpty())
        {
            return false;
        }
        return true;
        
    }
}
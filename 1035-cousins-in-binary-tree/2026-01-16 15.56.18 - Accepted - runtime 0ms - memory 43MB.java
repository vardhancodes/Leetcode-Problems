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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int levelsize = queue.size();
            int found = 0;
            for(int i = 0 ; i < levelsize ; i++)
            { 
                int parent = 0;
                TreeNode node = queue.poll();
                if(node.left != null)
                {
                    if(node.left.val == x || node.left.val == y)
                    {
                        parent++;
                        found++;
                    }
                    queue.offer(node.left);
                }
                if(node.right != null)
                {
                    if(node.right.val == x || node.right.val == y)
                    {
                        parent++;
                        found++;
                    }
                    queue.offer(node.right);
                }
                if( parent == 2 && found == 2)
                {
                    return false;
                }
            }
            if(found == 1 )
            {
                return false;
            }
        }
        return true;

    }
}
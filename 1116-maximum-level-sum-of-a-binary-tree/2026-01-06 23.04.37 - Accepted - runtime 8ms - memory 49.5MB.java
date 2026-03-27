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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        int level = 1;
        int ans = 1;
        int sum = root.val;
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int sum1 = 0;
            int levelsize = queue.size();
            for(int i = 0 ; i < levelsize ; i++)
            {
                TreeNode node = queue.poll();
                sum1 += node.val;
                if(node.left != null)
                {
                    queue.offer(node.left);
                    
                }
                if(node.right != null)
                {
                    queue.offer(node.right);
                    
                }
            }
            if(sum1 > sum)
            {
                sum = sum1;
                ans = level;
            }
            level++;
        }

        return ans;
        
    }
}
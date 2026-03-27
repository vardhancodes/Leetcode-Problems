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
            level++;
            int sum1 = 0;
            TreeNode node = queue.poll();
            if(node.left != null)
            {
                queue.offer(node.left);
                sum1 += node.left.val;
            }
            if(node.right != null)
            {
                queue.offer(node.right);
                sum1 += node.right.val;
            }
            if(sum1 > sum)
            {
                sum = sum1;
                ans = level;
            }
        }

        return ans;
        
    }
}
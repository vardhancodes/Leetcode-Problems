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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) return list;
        queue.offer(root);
        int level = 0;
        while(!queue.isEmpty())
        {
            int levelsize = queue.size();
            List<Integer> sublist = new ArrayList<>();
            for(int i = 0 ; i < levelsize ; i++)
            {
                TreeNode node = queue.poll();
                sublist.add(node.val);
                if(node.left != null)
                {
                    queue.offer(node.left);
                }
                if(node.right != null)
                {
                    queue.offer(node.right);
                }
            }
            if(level%2 != 0)
            {
                Collections.reverse(sublist);
                list.add(sublist);
            }
            else
            {
                list.add(sublist);
            }
            level++;
        }
        return list;
    }
}
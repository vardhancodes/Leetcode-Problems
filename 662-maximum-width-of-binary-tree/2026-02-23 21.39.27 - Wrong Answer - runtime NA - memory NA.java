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
    public int widthOfBinaryTree(TreeNode root) {
        int ans = 0;
        Queue<CustomNode> queue = new LinkedList<>();
        if(root == null)
        {
            return ans;
        }
        queue.offer(new CustomNode(root,0));
        while(!queue.isEmpty())
        {
            int levelsize = queue.size();
            int leftmost = -1;
            int rightmost = -1;
            for(int i = 0 ; i < levelsize ; i++)
            {
                CustomNode cus = queue.poll();
                if(leftmost == -1)
                {
                    leftmost = cus.pos;
                }
                else
                {
                    rightmost = cus.pos;
                }
                if(cus.node.left != null)
                {
                    queue.offer(new CustomNode(cus.node.left,2*cus.pos+1));
                }
                if(cus.node.right != null)
                {
                    queue.offer(new CustomNode(cus.node.right,2*cus.pos+2));
                }
            }
            if(leftmost != -1 && rightmost != -1)
            {
                ans = Math.max(ans,rightmost-leftmost+1);
            }

        }
        return ans;
    }
}
class CustomNode
{
    int pos;
    TreeNode node;
    CustomNode(TreeNode node, int pos)
    {
        this.pos = pos;
        this.node = node;
    }

}
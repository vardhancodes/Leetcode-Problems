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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while(!stack.isEmpty() || node != null)
        {
            //moving left
            while(node != null)
            {
                stack.push(node);
                node = node.left;
            }
            //moving right
            if(stack.peek().right != null)
            {
                node = stack.peek().right;
            }
            else
            {
                TreeNode temp = stack.pop();
                list.add(temp.val);
                while(!stack.isEmpty() && temp == stack.peek().right)
                {
                    temp = stack.pop();
                    list.add(temp.val); 
                }
                
            }
        }

        return list;
    }
}
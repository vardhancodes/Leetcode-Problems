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
    int pos = 0;
    public int kthSmallest(TreeNode root, int k) {
        // List<Integer> list = new ArrayList<>();
        int ans[] = new int[1];
        int pos[] = new int[1];
        dfs(root,ans,k-1,pos);
        return ans[0];
    }

    public static void dfs(TreeNode root ,int ans[], int target, int[] pos)
    {
        if(root == null)
        {
            return ;
        }
        dfs(root.left,ans,target,pos);
        if(pos[0] == target)
        {
            ans[0] = root.val;
        }
        pos[0]++;
        dfs(root.right,ans,target,pos);


    }
}
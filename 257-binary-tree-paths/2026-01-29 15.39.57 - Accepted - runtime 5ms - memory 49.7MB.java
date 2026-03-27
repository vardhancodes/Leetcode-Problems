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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        dfs(list,root,"");
        return list;
    }
    public static void dfs(List<String> list,TreeNode root, String s)
    {
        if(root == null)
        {
            return;
        }
        s += String.valueOf(root.val) + "->";
        if(isLeaf(root))
        {
            s = s.substring(0,s.length()-1);
            s = s.substring(0,s.length()-1);
            list.add(s);
            return;
        }

        dfs(list,root.left,s);
        dfs(list,root.right,s);


    }

    public static boolean isLeaf(TreeNode root)
    {
        if(root.left == null && root.right == null)
        {
            return true;
        }
        return false;
    }
}
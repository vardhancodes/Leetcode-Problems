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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> sublist = new ArrayList<>();
        dfs(list,sublist,root,targetSum);
        return list;
    }

    public static void dfs(List<List<Integer>> list,List<Integer> sublist, TreeNode root, int sum)
    {
        if(root == null)
        {
            return;
        }
        sum -= root.val;
        sublist.add(root.val);
        if(sum == 0 && isleaf(root))
        {
            list.add(new ArrayList<>(sublist));
        }

        dfs(list,sublist,root.left,sum);
        dfs(list,sublist,root.right,sum);

        sum += root.val;
        sublist.remove(sublist.size()-1);
    }

    public static boolean isleaf(TreeNode root)
    {
        if(root.left == null && root.right == null)
        {
            return true;
        }
        return false;
    }
}
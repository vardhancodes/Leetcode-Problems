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
    public void recoverTree(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(root,list);
        Collections.sort(list);
        int index[] = new int[1];
        construct(list,root,index);

    }

    public static void dfs(TreeNode root , List<Integer> list)
    {
        if(root == null)
        {
            return;
        }
        dfs(root.left,list);
        list.add(root.val);
        dfs(root.right,list);
    }

    public static void construct(List<Integer> list , TreeNode root, int []index)
    {
        if(root == null)
        {
            return;
        }
        construct(list,root.left,index);
        if(list.get(index[0]) != root.val)
        {
            root.val = list.get(index[0]);
        }
        index[0]++;
        construct(list,root.right,index);

    }



    
}
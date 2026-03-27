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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < inorder.length ; i++)
        {
            map.put(inorder[i],i);
        }
        int n = postorder.length-1;
        int m = inorder.length-1;
        TreeNode root = constructTree(inorder,postorder,map,0,n,0,m);
        return root;
    }

    static TreeNode constructTree(int[] inorder, int[] postorder, HashMap<Integer,Integer> map , int poststart , int postend, int instart , int inend)
    {
        if(inend < instart || postend < poststart)
        {
            return null;
        }

        int rootIndex = map.get(postorder[postend]);
        TreeNode root = new TreeNode(postorder[postend]);
        int leftsize = rootIndex - instart; 
        int rightsize = inend - rootIndex;
        root.left = constructTree(inorder,postorder,map,poststart,postend-rightsize-1,instart,rootIndex-1);
        root.right = constructTree(inorder,postorder,map,poststart+leftsize,postend-1,rootIndex+1,inend);

        return root;
    }
}
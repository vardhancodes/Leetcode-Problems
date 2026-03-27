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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < inorder.length ; i++)
        {
            map.put(inorder[i],i);
        }
        int n = inorder.length-1;
        int m = preorder.length-1;
        TreeNode root = constructTree(preorder,inorder,map,0,m,0,n);
        return root;
    }
    static TreeNode constructTree( int[] preorder, int[] inorder , HashMap<Integer,Integer> map, int preStart , int preEnd , int inStart , int inEnd)
    {
        if(preStart > preEnd || inStart > inEnd)
        {
            return null;
        }
        int rootIndex = map.get(preorder[preStart]);
        TreeNode root = new TreeNode(preorder[preStart]);
        int leftsize = rootIndex-inStart;
        int rightsize = inEnd-rootIndex;
        root.left = constructTree(preorder,inorder,map,preStart+1,preStart+leftsize,inStart,rootIndex-1);
        root.right = constructTree(preorder,inorder,map,preStart+leftsize+1,preEnd,rootIndex+1,inEnd);

        return root;

    }
}
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
    public boolean isCousins(TreeNode root, int x, int y) {
        int count[] = new int[1];
        int depth1 = Depth(root,x,0);
        int depth2 = Depth(root,y,0);
        System.out.println(depth1);
        System.out.println(depth2);
        if(depth1 != depth2)
        {
            return false;
        }
        if(sameParent(root,x,y))
        {
            return false;
        }
        return true;
    }
    public static int Depth(TreeNode root,int x , int ans)
    {
        if(root == null)
        {
            return -1;
        }

        if(root.val == x)
        {
            return ans;
        }

        int leftside = Depth(root.left,x,ans+1);
        if(leftside != -1)
        {
            return leftside;
        }
        return Depth(root.right,x,ans+1);
        
    }

    public static boolean sameParent(TreeNode root, int x , int y)
    {
        if(root == null)
        {
           return false;
        }
        if((root.left!= null && root.left.val == x && root.right!= null && root.right.val == y)||(root.left!= null && root.left.val == y && root.right!= null && root.right.val == x))
        {
            return true;
        }

        return sameParent(root.left,x,y) || sameParent(root.right,x,y);
    }
}
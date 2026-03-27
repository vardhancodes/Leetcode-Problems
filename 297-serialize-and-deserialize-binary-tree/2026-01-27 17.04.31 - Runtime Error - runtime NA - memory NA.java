/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder ans = new StringBuilder("");
        preorder(ans,root);
        ans.append(" ");    
        inorder(ans,root);
        return ans.toString();
    }
    public static void preorder(StringBuilder ans, TreeNode root)
    {
        if(root == null)
        {
            return;
        }
        ans.append(String.valueOf(root.val));
        preorder(ans,root.left);
        preorder(ans,root.right);

    }
     public static void inorder(StringBuilder ans, TreeNode root)
    {
        if(root == null)
        {
            return;
        }
        inorder(ans,root.left);
        ans.append(String.valueOf(root.val));
        inorder(ans,root.right);

    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        
        String[] arr = data.split(" ", -1);
        if (arr.length < 2) return null;

        String pre = arr[0];
        String in  = arr[1];

        if (pre.isEmpty() && in.isEmpty()) return null;


        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0 ; i < in.length() ; i++)
        {
            map.put(in.charAt(i),i);
        }
        int m = in.length();
        int n = pre.length();
        TreeNode root = createTree(0,n-1,0,m-1,pre,in,map);
        return root;

    }

    public static TreeNode createTree(int prestart, int preend, int instart, int inend, String pre, String in, HashMap<Character,Integer> map)
    {
        if(prestart > preend || instart > inend)
        {
            return null;
        }
        int rootindex = map.get(pre.charAt(prestart));
        TreeNode root = new TreeNode(pre.charAt(prestart)-'0');
        int leftsize = rootindex-instart;
        int rightsize = inend-rootindex;
        root.left = createTree(prestart+1,prestart+leftsize,instart,rootindex-1,pre,in,map);
        root.right = createTree(prestart+leftsize+1,preend,rootindex+1,inend,pre,in,map);

        return root;

    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
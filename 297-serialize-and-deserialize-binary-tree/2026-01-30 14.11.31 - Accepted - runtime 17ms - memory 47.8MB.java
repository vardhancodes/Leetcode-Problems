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
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null)
        {
            return ans.toString();
        }
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int levelsize = queue.size();
            for(int i = 0 ; i < levelsize ; i++)
            {
                TreeNode node = queue.poll();
                if(node == null)
                {
                    ans.append("#"+",");
                    continue;
                }
                else
                {
                    ans.append(node.val+",");
                }
                queue.offer(node.left);
                queue.offer(node.right);
            }
        }
        ans.deleteCharAt(ans.length()-1);
        return ans.toString();  
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String arr[] = data.split(",");
        if(data.length()==0)
        {
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int i = 1;
        while(!queue.isEmpty() && i < arr.length)
        {
            TreeNode node = queue.poll();
            if(!arr[i].equals("#"))
            {
                node.left = new TreeNode(Integer.parseInt(arr[i]));
                queue.offer(node.left);
            }
            i++;
            if(i < arr.length && !arr[i].equals("#"))
            {
                node.right = new TreeNode(Integer.parseInt(arr[i]));
                queue.offer(node.right);
            }
            i++;
            
        }
        return root;

    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
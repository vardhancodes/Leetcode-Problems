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
    public int[] findFrequentTreeSum(TreeNode root) {
        HashMap<Integer,Integer> map = new HashMap<>();
        dfs(root, map);
        int max = 0;
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue() > max)
            {
                max = entry.getValue();
                list.clear();
            }
            if(entry.getValue() == max)
            {
                list.add(entry.getKey());
            }

        }
        int ans[] = new int[list.size()];
        for(int i = 0 ; i < list.size() ; i++)
        {
            ans[i] = list.get(i);
        }

        return ans;
    }

    public static int dfs(TreeNode root, HashMap<Integer,Integer> map)
    {
        if(root == null)
        {
            return 0;
        }

        int leftsum = dfs(root.left,map);
        int rightsum = dfs(root.right,map);

        map.put(leftsum+rightsum+root.val, map.getOrDefault(leftsum+rightsum+root.val,0)+1);

        return root.val+leftsum+rightsum;
    }
}
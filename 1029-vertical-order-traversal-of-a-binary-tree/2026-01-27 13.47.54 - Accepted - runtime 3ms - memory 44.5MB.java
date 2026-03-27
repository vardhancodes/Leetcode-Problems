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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,TreeMap<Integer,List<Integer>>> map = new TreeMap<>();
        List<List<Integer>> list = new ArrayList<>();
        if( root == null)
        {
            return list;
        }
        dfs(map,root,0,0);
        for(Map.Entry<Integer,TreeMap<Integer,List<Integer>>> colentry : map.entrySet())
        {
            TreeMap<Integer,List<Integer>> rowsmap = colentry.getValue();
            List<Integer> sublist = new ArrayList<>();
            for(Map.Entry<Integer,List<Integer>> row : rowsmap.entrySet())
            {
                List<Integer> rowlist = new ArrayList<>(row.getValue());
                Collections.sort(rowlist);
                sublist.addAll(rowlist);
            }
            list.add(sublist);
        }
        return list;
    }

    public static void dfs(TreeMap<Integer,TreeMap<Integer,List<Integer>>> map, TreeNode node, int col , int row)
    {
        if(node == null)
        {
            return;
        }

        if(map.containsKey(col))
        {
            if(map.get(col).containsKey(row))
            {
                map.get(col).get(row).add(node.val);
            }
            else
            {
                List<Integer> sublist = new ArrayList<>();
                sublist.add(node.val);
                map.get(col).put(row,sublist);
            }
        }
        else
        {
            TreeMap<Integer,List<Integer>> inner = new TreeMap<>();
            List<Integer> sublist = new ArrayList<>();
            sublist.add(node.val);
            inner.put(row,sublist);
            map.put(col,inner);
        }

        dfs(map,node.left,col-1,row+1);
        dfs(map,node.right,col+1,row+1);
    }
}

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
        Queue<CustomNode> queue = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        if( root == null)
        {
            return list;
        }
        queue.offer(new CustomNode(root,0,0));
        while(!queue.isEmpty())
        {
            int levelsize = queue.size();
            for(int i = 0 ; i < levelsize ; i++)
            {
                CustomNode cus = queue.poll();
                if(map.containsKey(cus.col))
                {
                   if(map.get(cus.col).containsKey(cus.row))
                   {
                       map.get(cus.col).get(cus.row).add(cus.node.val);
                   }
                   else
                   {
                       List<Integer> sublist = new ArrayList<>();
                       sublist.add(cus.node.val);
                       map.get(cus.col).put(cus.row,(sublist));
                   }
                }
                else
                {
                    TreeMap<Integer,List<Integer>> innermap = new TreeMap<>();
                    List<Integer> sublist = new ArrayList<>();
                    sublist.add(cus.node.val);
                    innermap.put(cus.row,sublist);
                    map.put(cus.col,innermap);
                }
                
                if(cus.node.left != null)
                {
                    queue.offer(new CustomNode(cus.node.left,cus.col-1,cus.row+1));
                }
                if(cus.node.right != null)
                {
                    queue.offer(new CustomNode(cus.node.right,cus.col+1,cus.row+1));
                }
            }
        }
        
        for(Map.Entry<Integer,TreeMap<Integer,List<Integer>>> colentry : map.entrySet())
        {
            TreeMap<Integer,List<Integer>> rowsmap = colentry.getValue();
            List<Integer> sublist = new ArrayList<>();
            for(Map.Entry<Integer,List<Integer>> row : rowsmap.entrySet())
            {
                sublist.addAll(row.getValue());
            }
            Collections.sort(sublist);
            list.add(sublist);
        }
        return list;
    }
}
class CustomNode {
    TreeNode node;
    int col;
    int row;
    
    CustomNode(TreeNode node, int col, int row)
    {
        this.node = node;
        this.col = col;
        this.row = row;
    }
}
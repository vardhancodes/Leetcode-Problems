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
        Queue<CustomNode> queue = new LinkedList<>();
        TreeMap<Integer,TreeMap<Integer,List<Integer>>> map = new TreeMap<>();
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
                        map.get(cus.col).put(cus.row, sublist);
                    }
                }
                else
                {
                    TreeMap<Integer,List<Integer>> inmap = new TreeMap<>();
                    List<Integer> sublist = new ArrayList<>();
                    sublist.add(cus.node.val);
                    inmap.put(cus.row,sublist);
                    map.put(cus.col,inmap);
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
        List<List<Integer>> list = new ArrayList<>();
        for(Map.Entry<Integer,TreeMap<Integer,List<Integer>>> column : map.entrySet())
        {
            List<Integer> columnlist = new ArrayList<>();
            for(Map.Entry<Integer,List<Integer>> row : column.getValue().entrySet())
            {
                List<Integer> rowlist = row.getValue();
                Collections.sort(rowlist);
                columnlist.addAll(rowlist);
            }
            list.add(columnlist);
        }
        return list;

    }
}
class CustomNode{
    TreeNode node;
    int col;
    int row;
    CustomNode(TreeNode node , int col , int row)
    {
        this.node = node;
        this.col = col;
        this.row = row;
    }

}
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<CustomNode> queue = new LinkedList<>();
        TreeMap<Integer,List<Integer>> map = new TreeMap<>();
        List<List<Integer>> list = new ArrayList<>();
        if(root == null)
        {
            return list;
        }
        queue.offer(new CustomNode(root,0));
        while(!queue.isEmpty())
        {
            int levelsize = queue.size();
            for(int i = 0 ; i < levelsize ; i++)
            {
                CustomNode cus = queue.poll();
                if(map.containsKey(cus.row))
                {
                    
                    
                    map.get(cus.row).add(cus.node.val);
                }
                else
                {
                    List<Integer> sublist = new ArrayList<>();
                    sublist.add(cus.node.val);
                    map.put(cus.row,sublist);
                }

                if(cus.node.left != null)
                {
                    queue.offer(new CustomNode(cus.node.left,cus.row+1));
                }
                if(cus.node.right != null)
                {
                    queue.offer(new CustomNode(cus.node.right,cus.row+1));
                }

            }
        }

        for(Map.Entry<Integer,List<Integer>> entry : map.entrySet())
        {
            if(entry.getKey()%2 == 0)
            {
                list.add(entry.getValue());
            }
            else
            {
                List<Integer> sublist = new ArrayList<>();
                sublist = entry.getValue();
                Collections.reverse(sublist); 
                list.add(sublist);

            }
        }

        return list;
    }
}
class CustomNode{
    TreeNode node;
    int row;
    CustomNode(TreeNode node , int row)
    {
        this.node = node;
        this.row = row;
    }
}
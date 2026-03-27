/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        if(root == null)
        {
            return list;
        }
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int levelsize = queue.size();
            List<Integer> sublist = new ArrayList<>();
            for(int i = 0 ; i < levelsize ; i++)
            {
                Node node = queue.poll();
                sublist.add(node.val);
                for(int j = 0 ; j < node.children.size() ; j++)
                {
                    queue.offer(node.children.get(j));
                }
            }
            list.add(sublist);
        }
        return list;
    }
}
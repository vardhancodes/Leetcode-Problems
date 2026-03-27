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
    public int maxDepth(Node root) {
        Queue<Node> queue = new LinkedList<>();
        if(root == null)
        {
            return 0;
        }
        queue.offer(root);
        int levelcount = 0;
        while(!queue.isEmpty())
        {
            levelcount++;
            int levelsize = queue.size();
            for(int i = 0 ; i < levelsize ; i++)
            {
                Node node = queue.poll();
                for(int j = 0 ; j < node.children.size() ; j++)
                {
                    if(node.children.get(j) != null)
                    {
                        queue.offer(node.children.get(j));
                    }
                }

            }
        }
        return levelcount;
    }
    
}
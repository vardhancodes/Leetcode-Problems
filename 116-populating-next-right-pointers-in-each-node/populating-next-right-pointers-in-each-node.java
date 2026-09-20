/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Queue<Node> queue = new LinkedList<>();
        if(root == null)
        {
            return null;
        }
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int levelsize = queue.size();
            for(int i = 0 ; i < levelsize ; i++)
            {
                Node node = queue.poll();
                if(i == levelsize-1)
                {
                    node.next = null;
                }
                else
                {
                    node.next = queue.peek();
                }

                if(node.left != null)
                {
                    queue.add(node.left);
                }

                if(node.right != null)
                {
                    queue.add(node.right);
                }
                
            }
        }

        return root;
    }
}
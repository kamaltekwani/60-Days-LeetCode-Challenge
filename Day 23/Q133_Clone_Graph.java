/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

/*
 * Problem Link : https://leetcode.com/problems/clone-graph/
 * Solution Link : https://leetcode.com/problems/clone-graph/solutions/42319/simple-java-iterative-bfs-solution-with-hashmap-and-queue/
 *
 * Time Complexity : O(V+E)
 * Space Complexity : O(V)
 * V -> Number of Nodes
 * E -> Number of Edges
 */

class Q133_Clone_Graph
{
    public Node cloneGraph(Node node) 
    {
        if(node == null)
            return null;

        Map<Node,Node> map = new HashMap<Node,Node>();
        Queue<Node> queue = new LinkedList<Node>();

        map.put(node, new Node(node.val));
        queue.add(node);

        while(!queue.isEmpty())
        {
            Node current = queue.poll();
            for(Node neighbour : current.neighbors)
            {
                if(!map.containsKey(neighbour))
                {
                    queue.add(neighbour);
                    map.put(neighbour, new Node(neighbour.val));
                }
                map.get(current).neighbors.add(map.get(neighbour));
            }
        }
        return map.get(node);
    }
}

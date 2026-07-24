import java.util.*;

class Node {
    int val;
    List<Node> neighbors;

    Node(int val) {
        this.val = val;
        neighbors = new ArrayList<>();
    }
}

public class CloneGraph {

    static HashMap<Node, Node> map = new HashMap<>();

    public static Node cloneGraph(Node node) {

        if (node == null)
            return null;

        if (map.containsKey(node))
            return map.get(node);

        Node copy = new Node(node.val);
        map.put(node, copy);

        for (Node n : node.neighbors)
            copy.neighbors.add(cloneGraph(n));

        return copy;
    }

    public static void main(String[] args) {

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        n1.neighbors.add(n2);
        n2.neighbors.add(n3);
        n3.neighbors.add(n1);

        Node clone = cloneGraph(n1);

        System.out.println("Original Node = " + n1.val);
        System.out.println("Cloned Node = " + clone.val);
    }
}
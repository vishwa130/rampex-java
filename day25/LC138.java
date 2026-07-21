package Day25;

import java.util.HashMap;

public class LC138 {

    static class Node {
        int val;
        Node next;
        Node random;

        Node(int val) {
            this.val = val;
        }
    }

    static class Solution {

        public Node copyRandomList(Node head) {

            if (head == null)
                return null;

            HashMap<Node, Node> map = new HashMap<>();

            Node curr = head;

            while (curr != null) {
                map.put(curr, new Node(curr.val));
                curr = curr.next;
            }

            curr = head;

            while (curr != null) {

                map.get(curr).next = map.get(curr.next);
                map.get(curr).random = map.get(curr.random);

                curr = curr.next;
            }

            return map.get(head);
        }
    }

    public static void main(String[] args) {
        System.out.println("Create a random linked list to test.");
    }
}

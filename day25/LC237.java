package Day25;

public class LC237 {

    static class ListNode {

        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    static class Solution {

        public void deleteNode(ListNode node) {

            node.val = node.next.val;
            node.next = node.next.next;
        }
    }

    public static void main(String[] args) {
        System.out.println("Requires reference to node only.");
    }
}

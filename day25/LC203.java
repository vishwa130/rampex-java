package Day25;

public class LC203 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    static class Solution {

        public ListNode removeElements(ListNode head, int val) {

            ListNode dummy = new ListNode(0);
            dummy.next = head;

            ListNode curr = dummy;

            while (curr.next != null) {

                if (curr.next.val == val)
                    curr.next = curr.next.next;
                else
                    curr = curr.next;
            }

            return dummy.next;
        }
    }

    public static void main(String[] args) {
        System.out.println("Test by creating a linked list.");
    }
}

package Day25;

public class LC206 {

    static class ListNode {

        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    static class Solution {

        public ListNode reverseList(ListNode head) {

            ListNode prev = null;

            while (head != null) {

                ListNode next = head.next;
                head.next = prev;

                prev = head;
                head = next;
            }

            return prev;
        }
    }

    public static void main(String[] args) {
        System.out.println("Create list to test.");
    }
}

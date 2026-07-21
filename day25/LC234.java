package Day25;

public class LC234 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    static class Solution {

        public boolean isPalindrome(ListNode head) {

            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            ListNode prev = null;

            while (slow != null) {
                ListNode next = slow.next;
                slow.next = prev;
                prev = slow;
                slow = next;
            }

            while (prev != null) {
                if (head.val != prev.val)
                    return false;

                head = head.next;
                prev = prev.next;
            }

            return true;
        }
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        Solution obj = new Solution();

        System.out.println(obj.isPalindrome(head));
    }
}

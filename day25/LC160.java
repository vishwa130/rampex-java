package Day25;

public class LC160 {

    static class ListNode {

        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    static class Solution {

        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

            ListNode a = headA;
            ListNode b = headB;

            while (a != b) {

                a = (a == null) ? headB : a.next;
                b = (b == null) ? headA : b.next;
            }

            return a;
        }
    }

    public static void main(String[] args) {
        System.out.println("Create intersecting lists to test.");
    }
}

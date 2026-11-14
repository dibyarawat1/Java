package LinkedList;

// recursive approach
public class Reverse_Linked_List_recursiveApproach {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public ListNode reverseList(ListNode head) {
            return reverse(null, head);
        }

        public ListNode reverse(ListNode prev, ListNode curr) {
            if (curr == null) {
                return prev;
            }
            ListNode ahead = curr.next;
            curr.next = prev;
            return reverse(curr, ahead);
        }
    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
         ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;

        // Traverse the list
        while (curr.next != null) {
            if (curr.next.val == val) {
                // Remove the node with the matching value
                curr.next = curr.next.next;
            } else {
                // Move to the next node
                curr = curr.next;
            }
        }

        return dummy.next;
    }
}
public class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }

        // Create a dummy node to simplify edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        // Move `prev` to the node before the `left` position
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        // `start` is the first node to be reversed
        ListNode start = prev.next;
        ListNode then = start.next;

        // Reverse the sublist from position `left` to `right`
        for (int i = 0; i < right - left; i++) {
            start.next = then.next;
            then.next = prev.next;
            prev.next = then;
            then = start.next;
        }

        return dummy.next;
    }
}

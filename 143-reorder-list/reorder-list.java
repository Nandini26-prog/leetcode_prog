

class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        // Step 1: Find the middle of the list
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the list
        ListNode second = slow.next;
        slow.next = null;  // Split the list into two halves
        ListNode prev = null;

        while (second != null) {
            ListNode newNode = second.next;
            second.next = prev;
            prev = second;
            second = newNode;
        }
        second = prev;  // `second` now points to the head of the reversed second half

        // Step 3: Merge the two halves
        fast = head;
        while (second != null) {
            ListNode tmp1 = fast.next;
            ListNode tmp2 = second.next;

            fast.next = second;
            second.next = tmp1;

            fast = tmp1;
            second = tmp2;
        }
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

         if (headA == null || headB == null) return null;

        ListNode pointerA = headA;
        ListNode pointerB = headB;

        // Traverse both lists, switching heads when reaching the end.
        while (pointerA != pointerB) {
            pointerA = (pointerA == null) ? headB : pointerA.next;
            pointerB = (pointerB == null) ? headA : pointerB.next;
        }

        // Either both pointers are null (no intersection), or they meet at the intersection node.
        return pointerA;

        // ListNode ans=new ListNode();
        // while(headA!=null&&headB!=null){
        //     if(headA==headB){
        //         return headA;
        //     }
        //     headA=headA.next;
        //     headB=headB.next;
        // }
        // return ans;
    }
}
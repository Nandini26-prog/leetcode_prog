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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        int length=0;
        
     
        Stack<Integer> st=new Stack<>();

        while(fast!=null&&fast.next!=null){
            st.push(slow.val);
            slow=slow.next;
            fast=fast.next.next;           
        }
        if(fast!=null) slow=slow.next;
      //  fast=head;
        while(slow!=null){
            if(slow.val==st.peek()){
                st.pop();
            }
            //fast=fast.next.next;
            slow=slow.next;
        }
        return st.isEmpty();
    }
}
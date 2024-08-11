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
    public int getDecimalValue(ListNode head) {
        ListNode curr=head;
        int ans=0;
         
        int size=0;
        
        while(curr!=null){
           size++;
            curr=curr.next;
        }
        curr=head;
        int exp=size-1;
        while(curr!=null){
            ans+=curr.val*(Math.pow(2,exp));
            exp--;
            curr=curr.next;
        }
        return ans;
    }
}
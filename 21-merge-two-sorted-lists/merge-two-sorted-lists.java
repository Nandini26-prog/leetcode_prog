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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

           ListNode dummy = new ListNode(0);
        ListNode curr = dummy;


        ListNode curr1 = list1;
        ListNode curr2 = list2;


        while (curr1 != null && curr2 != null) {
            if (curr1.val < curr2.val) {
                curr.next = curr1;
                curr1 = curr1.next;
            } else {
                curr.next = curr2;
                curr2 = curr2.next;
            }
            curr = curr.next;
        }


        if (curr1 != null) {
            curr.next = curr1;
        }
        if (curr2 != null) {
            curr.next = curr2;
        }

        return dummy.next; 
    }
}
//         ListNode curr1=list1;
//         ListNode curr2=list2;
//         int size1=0,size2=0;
//         while(curr1!=null){
//             size1++;
//             curr1=curr1.next;
//         }
//          while(curr2!=null){
//             size2++;
//             curr2=curr2.next;
//         }
//         ListNode ans=new ListNode(size1+size2);
//         ListNode curr3=ans;

//         curr1=list1;
//         curr2=list2;

//         while(curr1!=null&&curr2!=null){
//             if(curr1.val<curr2.val){
//                 curr3.val=curr1.val;
//                 curr3=curr3.next;
//                 curr1=curr1.next;
//             }
//             else{
//                  curr3.val=curr2.val;
//                 curr3=curr3.next;
//                 curr2=curr2.next;
//             }
//         }
//         if(curr1!=null)
//          while(curr1!=null){
//             curr3.val=curr1.val;
//             curr3=curr3.next;
//             curr1=curr1.next;
//          }
//           if(curr2!=null)
//          while(curr2!=null){
//             curr3.val=curr2.val;
//             curr3=curr3.next;
//             curr2=curr2.next;
//          }
//          return ans;
//     }
// }
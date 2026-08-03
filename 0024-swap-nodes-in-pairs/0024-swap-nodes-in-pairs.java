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
    public ListNode swapPairs(ListNode head) {
       if (head==null){
        return null;
       }
       ListNode dummy=new ListNode(0);
       dummy.next=head;
       ListNode pre=dummy;

       while(pre.next!=null && pre.next.next!=null){
        ListNode one=pre.next;
        ListNode two=pre.next.next;

        one.next=two.next;
        two.next=one;
        pre.next=two;
        pre=one;

       }
       return dummy.next;

    }
}
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev=dummy;
        ListNode tmp=head;
        while(tmp !=null && tmp.next !=null){
            if(tmp.val==tmp.next.val){
                while(tmp.next !=null && tmp.val ==tmp.next.val){
                    tmp=tmp.next;
                }
            prev.next=tmp.next;}
            else{
                prev=prev.next;
            }
        tmp=tmp.next;
        }
    return dummy.next;
    }
}
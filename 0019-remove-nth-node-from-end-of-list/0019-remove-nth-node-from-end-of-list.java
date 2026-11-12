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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length=0;
        ListNode tmp=head;
        while(tmp!=null){
            length++;
            tmp=tmp.next;
        }
        tmp=head;
        if(n==length){
            return head.next;
        }
        for(int i=0;i<length-n-1;i++){
            tmp=tmp.next;
        }
        tmp.next=tmp.next.next;
    return head;
    }
}
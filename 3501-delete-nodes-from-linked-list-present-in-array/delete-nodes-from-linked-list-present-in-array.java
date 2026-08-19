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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> hs=new HashSet<>();
        for(int num:nums){
            hs.add(num);
        }
        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;
        while(head!=null){
            if(!hs.contains(head.val)){
                curr.next=head;
                curr=curr.next;
            }
        head=head.next;
        }
    curr.next=null;
    return dummy.next;
    }
}
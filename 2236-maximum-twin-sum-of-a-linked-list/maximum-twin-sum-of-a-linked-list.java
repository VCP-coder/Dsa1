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
    public int pairSum(ListNode head) {
        List<Integer> al=new ArrayList<>();
        while(head!=null){
            al.add(head.val);
            head=head.next;
        }
        int n=al.size();
        int res=0;
        for(int i=0;i<=n/2-1;i++){
            res=Math.max(res,al.get(i)+al.get(n-1-i));
        }
    return res;
    }
}
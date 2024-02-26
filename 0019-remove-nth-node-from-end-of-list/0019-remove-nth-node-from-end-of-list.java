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
        
       ListNode temp=new ListNode(0,head);
    ListNode p=temp,q=temp;
    while(n-->0){
        p=p.next;
    }
    while(p.next!=null){
        q=q.next;
        p=p.next;
    }
    q.next=q.next.next;
    return temp.next;
        
    }
}
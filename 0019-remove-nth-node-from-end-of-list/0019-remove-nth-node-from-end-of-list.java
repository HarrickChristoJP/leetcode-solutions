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
        if(n<1) return head;
        ListNode temp1=head,temp2=head;
        int count=0;
        while(temp1!=null){
            count++;
            temp1=temp1.next;
        }
        if(count<n) return temp2;
        int pos=count-n+1;
        for(int i=0;i<pos-2 && temp2!=null;i++){
            temp2=temp2.next;
        }
        if(pos==1) return head.next;
        temp2.next=temp2.next.next;
        return head;
    }
}
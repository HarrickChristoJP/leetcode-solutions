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
    public ListNode rotateRight(ListNode head, int k) {
        if (k<1 ||head==null||head.next==null) return head; 
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        k=k%count;
        for(int i=0;i<k;i++){
            ListNode temp1=head,temp2=head.next;
            while(temp2.next!=null){
                temp1=temp2;
                temp2=temp2.next;

            }
            temp2.next=head;
            temp1.next=null;
            head=temp2;
        }
        return head;
    }
}
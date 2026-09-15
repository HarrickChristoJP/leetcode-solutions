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
    public ListNode reverseList(ListNode head) {  
        ListNode prev = null,curr = head;    
        while (curr != null) {       
            ListNode next = curr.next; //just storing the actual next node 
            curr.next = prev;
            prev = curr;
            curr = next; //updating the stord node
        }
        return prev;
    }
}
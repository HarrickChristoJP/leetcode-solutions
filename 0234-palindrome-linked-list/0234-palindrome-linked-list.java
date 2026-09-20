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
/*class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        List<Integer> arr=new ArrayList<>();
        int count=0;
        while(temp!=null){
            arr.add(temp.val);
            count++;
            temp=temp.next;
        }
        int left=0,right=arr.size()-1;
        while(left<right){
            if(arr.get(left)!=arr.get(right)){
                return false;
            }
            left++;right--;
        }
        return true;
    }
}*/
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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head,fast=head;

        while(fast!=null && fast.next!=null){ //finding the mid val
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev=null,curr=slow;
        while(curr!=null){// reverse the 2nd half
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ListNode first=head,sec=prev;
        while(sec!=null){
            if(sec.val!=first.val) return false;
            first=first.next;
            sec=sec.next;
        }
        return true; 
    }
}
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
}
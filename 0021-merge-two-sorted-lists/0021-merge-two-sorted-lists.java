class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(100);
        ListNode head = dummy;

        ListNode temp1 = list1;
        ListNode temp2 = list2;

        while(temp1 != null && temp2 != null) {

            if(temp1.val <= temp2.val) {
                dummy.next = temp1;
                temp1 = temp1.next;
            }
            else {
                dummy.next = temp2;
                temp2 = temp2.next;
            }

            dummy = dummy.next;
        }

        if(temp1 == null) {
            dummy.next = temp2;
        }
        else {
            dummy.next = temp1;
        }

        return head.next;
    }
}
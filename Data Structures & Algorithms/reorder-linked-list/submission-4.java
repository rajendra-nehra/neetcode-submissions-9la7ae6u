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
    public void reorderList(ListNode head) {
        ListNode slow = head ;
        ListNode fast = head ;
        while(fast.next != null && fast.next.next != null)
        {
            slow = slow.next ;
            fast = fast.next.next ;
        }
        ListNode nextHalf = slow.next ;
        slow.next = null ;

        ListNode pre = null ;
        while(nextHalf != null){
            ListNode next = nextHalf.next ;
            nextHalf.next = pre ;
            pre = nextHalf ;
            nextHalf = next ;
        }
        ListNode first = head ;
        ListNode second = pre ;

        while(first != null && second != null){

            ListNode temp1 = first.next ;
            ListNode temp2 = second.next ;

            first.next = second ;
            second.next = temp1 ;

            first = temp1 ;
            second = temp2 ;
        }
    }
}

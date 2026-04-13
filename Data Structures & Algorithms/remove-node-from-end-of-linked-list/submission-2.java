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
        ListNode curr = head ;
        int count = 0 ;
        while(curr != null){
            count++;
            curr= curr.next ;
        }
        int requiredNode = count - n ;
        ListNode dummy = new ListNode();
        if(requiredNode == 0) return head.next ;
        ListNode ans = head ;
        dummy.next = ans;
        while(requiredNode > 1){
            ans = ans.next;
            requiredNode--;
        }
        ListNode removeNode = ans.next ;
        ListNode nextNode = removeNode.next ;

        ans.next = nextNode ;

        return dummy.next ;
    }
}

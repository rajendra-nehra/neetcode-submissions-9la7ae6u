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
        int count = 0 ;
        ListNode curr = head ;
        while(curr != null){
            count++; 
            curr = curr.next ;
        }
        int nodeToRemove = count - n;
        if(nodeToRemove == 0) return head.next ;
        ListNode dummy = new ListNode();
        
        ListNode removNode = head ;
        dummy.next = removNode;
        int i = 1 ;
        while(i < nodeToRemove){
            removNode = removNode.next;
            i++;
        }
        ListNode nodeToBeRemoved = removNode.next ;
        ListNode nextNode = nodeToBeRemoved.next;

        removNode.next = nextNode ;
        return dummy.next ;
    }
}

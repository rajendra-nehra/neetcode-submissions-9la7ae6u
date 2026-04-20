class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        List<ListNode> list = new ArrayList<>();
        ListNode curr = head;

        while (curr != null) {
            list.add(curr);
            curr = curr.next;
        }

        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            ListNode l = list.get(left);
            ListNode r = list.get(right);

            ListNode nextL = l.next; // store

            l.next = r;
            r.next = nextL;

            left++;
            right--;
        }

        // IMPORTANT: terminate list
        list.get(left).next = null;
    }
}
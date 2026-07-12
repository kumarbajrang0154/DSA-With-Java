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
        if (head == null) {
            return null;
        }
        int length = getLength(head);
        if (length == n) {
            return head.next;
        }
        int pos = length - n;
        ListNode current = head;
        for (int i = 1; i < pos; i++) {
            current = current.next;
        }
        current.next = current.next.next;
        return head;
    }
    private int getLength(ListNode head) {
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}
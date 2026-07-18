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
        if (head == null || head.next == null || k == 0)
            return head;
        int len = 1;
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
            len++;
        }
        k = k % len;
        if (k == 0)
            return head;
        while (k > 0) {
            ListNode prev = null;
            ListNode tail = head;
            while (tail.next != null) {
                prev = tail;
                tail = tail.next;
            }
            prev.next = null;
            tail.next = head;
            head = tail;
            k--;
        }
        return head;
    }
}
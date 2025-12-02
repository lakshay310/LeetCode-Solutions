/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

    public ListNode detectCycle(ListNode head) {
        if (head == null) return null;

        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                int cycleLength = getCycleLength(slow);
                return findStart(head, cycleLength);
            }
        }

        return null; 
    }
    private int getCycleLength(ListNode node) {
        ListNode current = node;
        int length = 0;

        do {
            current = current.next;
            length++;
        } while (current != node);

        return length;
    }
    private ListNode findStart(ListNode head, int length) {
        ListNode p1 = head;
        ListNode p2 = head;
        while (length > 0) {
            p2 = p2.next;
            length--;
        }
        while (p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
        }

        return p1; 
    }
}


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int headACount = 0;
        int headBCount = 0;
        ListNode headACurrent = headA;
        ListNode headBCurrent = headB;
        while (headACurrent != null) {
            headACurrent = headACurrent.next;
            headACount++;
        }
        while (headBCurrent != null) {
            headBCurrent = headBCurrent.next;
            headBCount++;
        }
        headACurrent = headA;
        headBCurrent = headB;
        if (headACount > headBCount) {
            int diff = headACount - headBCount;
            for (int i = 1; i <= diff; i++) {
                headACurrent = headACurrent.next;
            }
        } else if (headACount < headBCount) {
            int diff = headBCount - headACount;
            for (int i = 1; i <= diff; i++) {
                headBCurrent = headBCurrent.next;
            }
        }
        while (headACurrent != null && headBCurrent != null) {
            if (headACurrent == headBCurrent) {
                return headACurrent;
            } else {
                headACurrent = headACurrent.next;
                headBCurrent = headBCurrent.next;
            }
        }
        return null;
    }
}

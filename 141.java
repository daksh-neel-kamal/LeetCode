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
    public boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        if(head == null || head.next == null){
            return false;
        }
        while(slow != null){
            slow = slow.next;
            if(slow == null){
                return false;
            }
            fast = fast.next;
            if(fast == null){
                return false;
            }
            fast = fast.next;
            if(fast == null){
                return false;
            }
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}

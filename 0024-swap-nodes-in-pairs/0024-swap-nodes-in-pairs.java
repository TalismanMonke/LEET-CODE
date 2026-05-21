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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
       ListNode previous = dummy;
        ListNode first = head;
    
        while (first != null && first.next != null) {
            ListNode second = first.next;
    
            // Perform the swap
            previous.next = second;
            first.next = second.next;
            second.next = first;
    
            // Move pointers
            previous = first;
            first = first.next;
        }
    
        head = dummy.next;
        return head;
    }

    }

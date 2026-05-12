public class Solution {
    public boolean hasCycle(ListNode head) {

        ListNode current = head;
        ListNode temp = head;

        while (temp != null && temp.next != null) {
            current = current.next; 
            temp = temp.next.next;
            if (current == temp) {
                return true;
            }
        }
        return false;
    }
}
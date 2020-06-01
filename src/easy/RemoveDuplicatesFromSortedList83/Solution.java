package easy.RemoveDuplicatesFromSortedList83;

/**
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * @author Gevorg Mkrtchyan
 *
 * Input: 1->1->2
 * Output: 1->2
 *
 * Input: 1->1->2->3->3
 * Output: 1->2->3
 */
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode iterator = head;
        while (iterator != null && iterator.next != null) {
            if (iterator.val == iterator.next.val) {
                iterator.next = iterator.next.next;
            } else {
                iterator = iterator.next;
            }
        }
        return head;
    }
}

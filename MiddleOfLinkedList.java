// 876. Middle of the Linked List
import java.util.logging.Logger;

public class MiddleOfLinkedList {
    private static final Logger LOGGER = Logger.getLogger(MiddleOfLinkedList.class.getName());

    private MiddleOfLinkedList() {
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        LOGGER.info(() -> String.valueOf(middleNode(head).val));
    }
}

// 141. Cycle in a Linked List
public class CycleLinkedList {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    static class Solution {
        public boolean hasCycle(ListNode head) {
            if (head == null) return false;

            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;         // 1 step
                fast = fast.next.next;   // 2 steps

                if (slow == fast) {
                    return true; // cycle detected
                }
            }
            return false; // no cycle
        }
    }

    // MAIN method for VS Code execution
    public static void main(String[] args) {

        // Create nodes
        ListNode head = new ListNode(3);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(0);
        ListNode fourth = new ListNode(-4);

        // Link nodes: 3 → 2 → 0 → -4
        head.next = second;
        second.next = third;
        third.next = fourth;

        // Create cycle: -4 → 2
        fourth.next = second;

        Solution solution = new Solution();
        boolean result = solution.hasCycle(head);

        System.out.println(result);
    }
}

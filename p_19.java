import java.util.ArrayList;

class RemoveNthFromEndSolution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode left = dummy;
        ListNode right = head;

        while (n > 0) {
            right = right.next;
            n--;
        }

        while (right != null) {
            left = left.next;
            right = right.next;
        }

        left.next = left.next.next;
        return dummy.next;
    }
}

// leetcode url: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
public class p_19 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        int n = 3;

        RemoveNthFromEndSolution solution = new RemoveNthFromEndSolution();
        ListNode result = solution.removeNthFromEnd(node1, n);
        ArrayList<Integer> list = new ArrayList<>();
        while (result != null) {
            list.add(result.val);
            result = result.next;
        }
        System.out.println("The result is: " + list.toString());
    }
}

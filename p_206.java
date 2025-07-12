import java.util.ArrayList;

class ReverseListSolution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode newHead = head;
        if (head.next != null) {
            newHead = reverseList(head.next);
            head.next.next = head;
        }
        head.next = null;

        return newHead;
    }
}

// leetcode url: https://leetcode.com/problems/reverse-linked-list/
public class p_206 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ReverseListSolution solution = new ReverseListSolution();
        ListNode result = solution.reverseList(node1);
        ArrayList<Integer> list = new ArrayList<>();
        while (result != null) {
            list.add(result.val);
            result = result.next;
        }
        System.out.println("The result is: " + list.toString());
    }
}

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
// public class p_33 {
// public static void main(String[] args) {
// int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
// int target = 0;
// SortedRotatedSearchSolution solution = new SortedRotatedSearchSolution();
// int result = solution.search(nums, target);
// System.out.println("The result is: " + result);
// }
// }

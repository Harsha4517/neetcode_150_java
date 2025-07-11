class ReverseListNode {
    int val;
    ReverseListNode next;

    ReverseListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class ReverseListSolution {
    public ReverseListNode reverseList(ReverseListNode head) {
        if (head == null) {
            return null;
        }

        ReverseListNode newHead = head;
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

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

class HasCycleSolution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow)
                return true;
        }
        return false;
    }
}

// leetcode url: https://leetcode.com/problems/linked-list-cycle/
// public class p_141 {
// public static void main(String[] args) {
// int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
// int target = 0;
// SortedRotatedSearchSolution solution = new SortedRotatedSearchSolution();
// int result = solution.search(nums, target);
// System.out.println("The result is: " + result);
// }
// }

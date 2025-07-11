class MergeTwoListsListNode {
    int val;
    ListNode next;

    MergeTwoListsListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class MergeTwoListsSolution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode node = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                node.next = list1;
                list1 = list1.next;
            } else {
                node.next = list2;
                list2 = list2.next;
            }
            node = node.next;
        }

        if (list1 != null) {
            node.next = list1;
        } else {
            node.next = list2;
        }

        return dummy.next;
    }
}

// leetcode url: https://leetcode.com/problems/merge-two-sorted-lists/
// public class p_33 {
// public static void main(String[] args) {
// int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
// int target = 0;
// SortedRotatedSearchSolution solution = new SortedRotatedSearchSolution();
// int result = solution.search(nums, target);
// System.out.println("The result is: " + result);
// }
// }

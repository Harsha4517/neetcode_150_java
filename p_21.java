import java.util.ArrayList;

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
public class p_21 {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);
        ListNode list2 = new ListNode(1);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);

        list1.next = node2;
        node2.next = node3;
        list2.next = node4;
        node4.next = node5;
        MergeTwoListsSolution solution = new MergeTwoListsSolution();
        ListNode result = solution.mergeTwoLists(list1, list2);
        ArrayList<Integer> list = new ArrayList<>();
        while (result != null) {
            list.add(result.val);
            result = result.next;
        }
        System.out.println("The result is: " + list.toString());
    }
}

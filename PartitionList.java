// import java.util.ArrayList;
// import java.util.List;

public class PartitionList {
    public static void main(String[] args) {
        int x = 3;
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(2);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        ListNode head = node1;
        // System.out.println(head);
        // head = node1;
        while (head != null) {
            // System.out.println(head.val);
            head = head.next;
        }
        head = node1;
        answer(head, x);
    }

    public static void answer(ListNode head, int x) {
        ListNode left = new ListNode(0);
        ListNode right = new ListNode(0);
        ListNode leftListnode = left;
        ListNode righListnode = right;
        while (head != null) {
            if (head.val < x) {
                leftListnode.next = head;

                leftListnode = leftListnode.next;
            } else {
                righListnode.next = head;
                righListnode = righListnode.next;
            }
            head = head.next;
        }
        leftListnode.next = right.next;
        righListnode.next = null;
        printList(left.next);
        // return left.next;
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
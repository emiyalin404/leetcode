public class PaetitionListTwo {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(2);
        int x = 3;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        output(node1, x);
    }

    public static void output(ListNode head, int x) {
        ListNode prev = head;
        System.out.println();

        while (prev.next != null && prev.next.val < 3) {
            prev = prev.next;
        }
        if (prev.next != null) {
            ListNode nodeToMove = prev.next;
            prev.next = prev.next.next;
            nodeToMove.next = null;

            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            prev = current;
            current.next = nodeToMove;

        }
        printList(head);
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

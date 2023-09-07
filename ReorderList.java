public class ReorderList {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        // input(node1);
        ReorderList reorderList = new ReorderList();
        reorderList.input(node1);
    }

    // private ListNode reverse(ListNode head) {
    // ListNode prev = null;

    // while (head != null) {
    // ListNode next = head.next;
    // head.next = prev;
    // prev = head;
    // head = next;
    // }

    // return prev;
    // }

    public void input(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }

        ListNode curr = slow.next;
        slow.next = null;
        ListNode prev = null;
        ListNode forw = null;

        while (curr != null) {
            forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }

        while (prev != null)

        {
            ListNode p = head.next;
            ListNode q = prev.next;
            head.next = prev;
            prev.next = p;
            prev = q;
            head = p;
            System.out.println(head);
        }

        // if (head == null || head.next == null) {
        // return;
        // }

        // // Find the middle of the list
        // ListNode slow = head, fast = head;

        // while (fast != null && fast.next != null) {
        // slow = slow.next;
        // fast = fast.next.next;
        // }

        // // Reverse the second half of the list
        // ListNode second = reverse(slow);
        // ListNode first = head;

        // // Construct the new list by interleaving two lists
        // while (first != null && second != null) {
        // ListNode tmp = first.next;
        // first.next = second;
        // first = tmp;
        // tmp = second.next;
        // second.next = first;
        // second = tmp;
        // }

        // if (first != null) {
        // first.next = null;
        // }
    }

}

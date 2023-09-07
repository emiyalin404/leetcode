// import java.util.List;

public class LinkedListCycle {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node1; // 創建循環

        boolean hasCycle = hasCycle(node1);
        System.out.println(hasCycle);
    }

    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true; // 檢測到環，回傳 true
            }
        }
        return false; // 沒有檢測到環，回傳 false
    }
    // public static void main(String[] args) {
    // ListNode node1 = new ListNode(3);
    // ListNode node2 = new ListNode(2);
    // ListNode node3 = new ListNode(0);
    // ListNode node4 = new ListNode(-4);
    // node1.next = node2;
    // node2.next = node3;
    // node3.next = node4;
    // node4.next = node1; // 創建循環

    // boolean hasCycle = hasCycle(node1);
    // System.out.println(hasCycle); // 輸出 true
    // }

    // public static boolean hasCycle(ListNode head) {
    // ListNode slow = head;
    // ListNode fast = head;
    // while (fast != null && fast.next != null) {
    // slow = slow.next;
    // fast = fast.next.next;
    // if (slow == fast) {
    // return true; // 檢測到環，回傳 true
    // }
    // }
    // return false; // 沒有檢測到環，回傳 false
    // }
}

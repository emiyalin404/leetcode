// import java.util.ArrayDeque;
// import java.util.Deque;
// import java.util.HashMap;

public class MiddleOfTheLinkedList {
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

        input(node1);
    }

    public static void input(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // return slow;
        System.out.println(slow);
        // // System.out.println(temperatures);
        // int length = temperatures.length;

        // if (length == 0)
        // System.out.println("null");

        // int[] answer = new int[length];

        // // creat a dictionary keeps temperature and index in int[] temperature
        // HashMap<Integer, Integer> map = new HashMap<>();
        // // create a monotonic list
        // Deque<Integer> deque = new ArrayDeque<>();
        // for (int i = length - 1; i >= 0; i--) {
        // int temperature = temperatures[i];
        // map.put(temperature, i);
        // while (!deque.isEmpty() && deque.peekLast() <= temperature) {
        // deque.pollLast();
        // }

        // int result = deque.isEmpty() ? -1 : deque.peekLast();
        // if (result == -1) {
        // answer[i] = 0;
        // } else {
        // result = map.get(result) - i;
        // answer[i] = result;
        // }

        // deque.addLast(temperatures[i]);

        // }
        // System.out.println(answer);
        // // return answer;

    }
}

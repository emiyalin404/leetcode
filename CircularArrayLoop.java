// 煩躁
public class CircularArrayLoop {
    public static void main(String[] args) {
        int[] nums = { 1, -1, 5, 1, 4 };
        circularArrayLoop(nums);
    }

    public static boolean circularArrayLoop(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            boolean isForward = nums[i] >= 0; // if we are moving forward or not
            int slow = i, fast = i;

            // If slow or fast becomes '-1' this means we can't find cycle for this number
            do {
                slow = findNextIndex(nums, isForward, slow); // move one step for slow pointer
                fast = findNextIndex(nums, isForward, fast); // move one step for fast pointer
                if (fast != -1) {
                    fast = findNextIndex(nums, isForward, fast); // move another step for fast pointer
                }
            } while (slow != -1 && fast != -1 && slow != fast);

            if (slow != -1 && slow == fast) {
                System.out.println("true");
                return true;
            }
        }
        System.out.println("false");
        return false;
    }

    private static int findNextIndex(int[] nums, boolean isForward, int currentIndex) {
        boolean direction = nums[currentIndex] >= 0;
        if (isForward != direction) {
            return -1; // change in direction, return -1
        }

        // wrap around for negative numbers
        int nextIndex = (currentIndex + nums[currentIndex] + nums.length) % nums.length;

        // one element cycle, return -1
        if (nextIndex == currentIndex) {
            nextIndex = -1;
        }

        return nextIndex;
    }
}

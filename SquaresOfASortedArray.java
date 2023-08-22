public class SquaresOfASortedArray {
    public static void main(String[] args) {
        int[] List = { -4, -1, 0, 3, 10 };
        input(List);
    }

    public static void input(int[] arr) {
        int n = arr.length;
        int[] squares = new int[n];

        int highestIdx = n - 1;
        int l = 0, r = n - 1;
        while (l <= r) {
            int left = arr[l] * arr[l];
            int right = arr[r] * arr[r];

            if (left >= right) {
                squares[highestIdx--] = left;
                l++;
            } else {
                squares[highestIdx--] = right;
                r--;
            }
        }
        // System.out.println(squares.length);
        for (var each : squares) {
            System.out.print(each + ", ");
        }

    }
}

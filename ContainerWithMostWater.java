public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        // int[] height = { 1, 1 };
        output(height);
    }

    public static void output(int[] height) {

        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                maxArea = Math.max(maxArea, Math.min(height[i], height[j]) * (j - i));
            }
        }
        System.out.println(maxArea);
        // -------------------------------------------------------------------
        // int maxArea = 0;
        // int left = 0;
        // int right = height.length - 1;

        // while (left < right) {
        // int minHeight = Math.min(height[left], height[right]);
        // int width = right - left;
        // int area = minHeight * width;
        // maxArea = Math.max(maxArea, area);

        // // 移動較小的高度的指針，以尋找可能更大的區域
        // if (height[left] < height[right]) {
        // left++;
        // } else {
        // right--;
        // }
        // }
        // System.out.println(maxArea);
        // return maxArea;

    }
}


public class maxAreaContainer {

    public int maxArea(int[] heights) {

        int width = 0;
        int height = 0;
        int area = 0;

        int leftPointer = 0;
        int rightPointer = heights.length - 1;

        while (leftPointer < rightPointer) {

            width = rightPointer - leftPointer;

            height = Math.min(heights[leftPointer], heights[rightPointer]);

            area = Math.max(width * height, area);

            if (heights[leftPointer] < heights[rightPointer]) {

                leftPointer++;
                continue;
            } else if (heights[leftPointer] > heights[rightPointer]) {
                rightPointer--;
                continue;

            } else if (heights[leftPointer] == heights[rightPointer] && heights[leftPointer + 1] > heights[rightPointer - 1]) {
                leftPointer++;

            } else if (heights[leftPointer] == heights[rightPointer] && heights[leftPointer + 1] < heights[rightPointer - 1]) {
                rightPointer--;
            } else {
                leftPointer++;
            }

        }

        return area;

    }

}

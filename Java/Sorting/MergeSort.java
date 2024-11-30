
import java.util.*;

class MergeSort {

    public static int[] mergeSort(int[] array) {

        int length = array.length;
        if (length <= 1) {
            return array;
        }

        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0, l = 0, r = 0;

        for (; i < length; i++) {
            if (i < middle) {
                leftArray[i] = array[i];
            } else {
                rightArray[i - middle] = array[i];

            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);

        return merge(leftArray, rightArray, array);

    }

    public static int[] merge(int[] leftArray, int[] rightArray, int[] array) {

        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;

        //indicies for each array. Left, Right and Original
        int i = 0, l = 0, r = 0;

        while (l < leftSize && r < rightSize) {
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            } else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while (l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while (r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }

        return array;
    }

    public static void main(String[] args) {

        int[] arr = {99, 74, 2, 18, 928, 1, 2, 100};
        int[] sortedArr = mergeSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(sortedArr));

    }
}

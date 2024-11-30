// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Arrays;

class bubbleSort{
    
    public static int[] bubbleSort(int[] arr) {
        int n = arr.length -1; //
        
        for (int i = 0; i < n; i++) // Array to loop 
        {
            for (int j = 0; j < n - i; j++) // Minus i to make array smaller after each iteration
            {
                if (arr[j] > arr[j + 1]) //compare element to the one immediately after it
                {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            
        }
        return arr;
        
    }
    
    public static void main(String[] args) {
        
         int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Sorted array: " + Arrays.toString(bubbleSort(arr)));
        
        
    }
}
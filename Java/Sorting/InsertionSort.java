
import java.util.*;
class InsertionSort {
    public static int[] insertionSort(int[] arr){
        
        int n = arr.length ;
        
        for(int i = 1; i < n; i++)
        {
            int key = arr[i];
            int j = i -1 ;
            
            while(j >= 0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j -1 ;
            }
            arr[j+1] = key ;
                
            }
            return arr ;
            
        }
        
        
    
    public static void main(String[] args) {
        
        int[] arr = {99, 74,2, 18, 928, 1,2, 100} ;
        int [] sortedArr = insertionSort(arr) ;
        System.out.println("Sorted array: " + Arrays.toString(sortedArr));
        
    }
}
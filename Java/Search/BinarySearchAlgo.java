
class BinarySearchAlgo {

    public static int binarySearch(double[] array, int target) {
        int firstIndex = 0;
        int lastIndex = array.length - 1;

        while (firstIndex <= lastIndex) {
            int middleIndex = firstIndex + (lastIndex - firstIndex) / 2;
            System.out.println("Middle index value: " + array[middleIndex]);

            if (array[middleIndex] < target) {
                firstIndex = middleIndex + 1;

            } else if (array[middleIndex] > target) {
                lastIndex = middleIndex - 1;
            } else {
                return middleIndex;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        double[] arr = new double[1000];
        int target = 97;
        //populate arr with random elemnts between 0-1000
        for (int i = 0; i < arr.length; i++) {
            //arr[i] = Math.round(Math.random() * 1000) ;
            arr[i] = i;
        }
        /*
        // Use built in binarySearch function to get the index of the target
        int indexOfTarget = Arrays.binarySearch(arr, target);
        //Print results
        if(indexOfTarget == -1){
            System.out.println("Not found"); 
        }else{
            System.out.println("Element found at: " + indexOfTarget);
        }*/
        int indexOfTarget = binarySearch(arr, 97);
        if (indexOfTarget == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at: " + indexOfTarget);
        }

    }
}

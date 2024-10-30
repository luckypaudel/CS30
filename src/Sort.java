public class Sort {
    public static void selectionSortIntArr(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int lowestIndex = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[lowestIndex]){
                    lowestIndex = j;
                }
            }
//swaps the lowest to the beginning
            int temp = arr[i];
            arr[i] = arr[lowestIndex];
            arr[lowestIndex] = temp;

        }
    }
    public static void selectionSortStringsArr(String[] arr){
        for(int i=0; i<arr.length-1; i++){
            int lowestIndex = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j].compareToIgnoreCase(arr[lowestIndex]) < 0){
                    lowestIndex = j;
                }
            }
//swaps the lowest to the beginning
            String temp = arr[i];
            arr[i] = arr[lowestIndex];
            arr[lowestIndex] = temp;

        }
    }
//    public static void insertionSort(String array[]) {
//        int n = array.length;
//        for (int j = 1; j < n; j++) {
//            String key = array[j];
//            int i = j-1;
//            while ( (i > -1) && ( array [i].compareToIgnoreCase(key) > 0 ) ) {
//                array [i+1] = array [i];
//                i--;
//            }
//            array[i+1] = key;
//        }
//
//    }//https://www.javatpoint.com/insertion-sort-in-java (modified for strings)
//    /* Function to sort array using insertion sort */
    public static void insertionSort(String arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            String key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j].compareToIgnoreCase(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }//https://www.geeksforgeeks.org/insertion-sort-algorithm/
}



public class selectionsort {
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length-1 ; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                //if (arr[min] < arr[j])
                //for descending order
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            // swap
            int t = arr[min];
            arr[min] = arr[i];
            arr[i] = t;
        }
    }

    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int crr = arr[i];
            int prev = i - 1;
            // finding out the correct position to insert
           
           // while (prev >= 0 && arr[prev] < crr)
           //for descending order
            while (prev >= 0 && arr[prev] > crr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev + 1] = crr;
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        selectionSort(arr);
        printArr(arr);
        insertionSort(arr);
        printArr(arr);
    }
}

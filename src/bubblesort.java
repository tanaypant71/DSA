public class bubblesort {
    public static void bubbleSort(int arr[]) {
        boolean swaps = true;
        for (int i = 0; i < arr.length - 1; i++) {
            swaps = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //if (arr[j] < arr[j + 1])
                //for descending order
                if (arr[j] > arr[j + 1]) {
                    // swap the elements
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                    swaps = true;
                }
                System.out.println(swaps);
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5,4,3,2,1 };
        bubbleSort(arr);
        printArr(arr);
    }
}

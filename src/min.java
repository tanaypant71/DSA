import java.util.Arrays;
import java.util.Collections;

class min {
    static int getMin(int arr[], int i, int n) {
        // If there is single element, return it.
        // Else return minimum of first element and
        // minimum of remaining array.
        // return (n == 1) ? arr[i] : Math.min(arr[i],
        // getMin(arr,i + 1 , n - 1));

        int ans = arr[0];
        for (i = 0; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }

        return ans;

    }

    static int getMax(int arr[], int i, int n) {
        // If there is single element, return it.
        // Else return maximum of first element and
        // maximum of remaining array.
        // return (n == 1) ? arr[i] : Math.max(arr[i],
        // getMax(arr ,i + 1, n - 1));

        int ans = arr[0];
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }

        return ans;

    }

    // Driver code
    public static void main(String[] args) {
        int arr[] = { 18, 12, -7, 2, 48 };
        int n = arr.length;
        System.out.print("Minimum element of array: " +
                getMin(arr, 0, n) + "\n");
        System.out.println("Maximum element of array: " +
                getMax(arr, 0, n));
    }
}

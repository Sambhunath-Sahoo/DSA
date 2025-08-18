package sorting;

public class Sorting {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void selectionSort(int[] arr) {

        int n = arr.length;
        for (int i = 0; i <= n-2; i++) {
            int minIndex = i;
            for (int j = i+1; j <=  n-1; j++) {
                if (arr[minIndex] >= arr[j]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i <= n-2; i++) {
            for (int j = 0; j <= n-2 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                }
            }
        }
//        for (int j = 0; j < n - 1; j++) {
//            for (int i = 0; i < n - j; i++) {
//                if (arr[i] > arr[i + 1]) {
//                    int temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//                }
//            }
//        }
    }

    public static void sortArray(int[] arr, int low, int mid, int high) {

        int n1 = mid - low + 1;
        int n2 = high - mid;

        // Create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];



    }

    public static void mergeSort(int[] arr, int low, int high) {

        if (low >= high) return;

        int mid = (low + high) / 2;
        mergeSort(arr, low , mid);
        mergeSort(arr, mid+1 , high);
        sortArray(arr, low, mid, high);
    }

    public static void main(String[] args) {
        int[] arr = {10 , 5, 2, 9, 1, 5, 6};
        selectionSort(arr);
//        mergeSort(arr, 0, 6);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

package DivideAndConquer;

public class QuickSort {

    private static void quickSort(int[] arr, int si, int ei) {
        // Base case, If reduced to single element
        if (si >= ei) {
            return;
        }

        // Find the pivot index to sort on that basis
        int pvtIdx = partition(arr, si, ei);

        // Sort the left side
        quickSort(arr, si, pvtIdx - 1);
        // Sort the right side
        quickSort(arr, pvtIdx + 1, ei);
    }

    private static int partition(int[] arr, int si, int ei) {
        // Let the last element be the pivot
        int pivot = arr[ei];
        // Initiate iterator before the first element
        int i = si - 1;

        // Iterate through the array and place elements smaller than pivot to the left
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                // Increment i and swap arr[i] and arr[j]
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Now position the pivot element to correct place
        i++;
        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int[] arr = {9, 3, 7, 5, 6, 4, 8, 2, 1};
        quickSort(arr, 0, arr.length - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

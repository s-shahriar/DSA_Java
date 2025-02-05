package DivideAndConquer;

public class MergeSort {
    public static void mergeSort(int[] arr, int si, int ei){

        // Base case, If reduced to single element
        if(si >= ei) {
            return;
        }

        int mid = si + (ei-si) / 2;

        // Sort the left side
        mergeSort(arr, si, mid);
        // Sort the right side
        mergeSort(arr, mid+1,ei);

        // Now conquer - merge the sorted left and right side
        merge(arr, si, mid, ei);
    }

    private static void merge(int[] arr, int si, int mid, int ei) {

        // create a temporary array to accommodate right and left side array
        int[] temp = new int[ei-si+1];

        // Init the iterators
        int i = si; // for left side array
        int j = mid+1; // for right side array
        int k = 0; // for the temp array

        // now sort it
        while(i <= mid && j <= ei){
            if(arr[i] <= arr[j]){
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr [j];
                j++;
            }
            k++;
        }


        // For left over left array elements
        while(i<= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }


        // For left over right array elements
        while(j <= ei) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        // Now copy the temp array to the main array
        for(k=0,  i = si; k < temp.length; k++, i++){
            arr[i] = temp[k];
        }

    }

    public static void main(String[] args) {
        int[] arr = {9, 3, 7, 5, 6, 4, 8, 2, 1};
        mergeSort(arr, 0, arr.length-1);

        // print the array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

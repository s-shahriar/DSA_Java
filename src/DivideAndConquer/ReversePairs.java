package DivideAndConquer;

import java.util.Arrays;

public class ReversePairs {

    public static int mergeSort(int[] arr, int si, int ei){

        // Base case, If reduced to single element
        if(si >= ei) {
            return 0;
        }

        int count = 0;
        int mid = si + (ei-si) / 2;

        // count from the left side
        count += mergeSort(arr, si, mid);
        // count from the right side
        count += mergeSort(arr, mid+1,ei);

        // Now conquer - merge the sorted left and right side and return count
        count += merge(arr, si, mid, ei);

        return count;
    }


    private static int merge(int[] arr, int si, int mid, int ei) {
        int count= 0;
        // create a temporary array to accommodate right and left side array
        int[] temp = new int[ei-si+1];

        // Init the iterators
        int i = si; // for left side array
        int j = mid+1; // for right side array
        int k = 0; // for the temp array

        // count the reverse pairs
        while(i <= mid && j <= ei){
            if((long) arr[i] > 2 * (long) arr[j]){
                count += (mid - i) + 1;
                j++;
            } else {
                i++;
            }
        }

        i = si;
        j = mid +1 ;

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

        return count;

    }


    public static void main(String[] args) {
        int[] nums = {1,3,2,3,1};
        System.out.println("Provided Array = " + Arrays.toString(nums));
        int ans = mergeSort(nums, 0, nums.length-1);
        System.out.println("Count of Reverse pairs = " + ans);
    }
}

//
// mergeSort(arr, si, ei)
//    ├── Base case: If si >= ei, return 0
//        ├── Divide the array at mid = (si + ei) / 2
//        ├── Count reverse pairs in left half: mergeSort(arr, si, mid)
//    ├── Count reverse pairs in right half: mergeSort(arr, mid+1, ei)
//    ├── Merge both halves while counting reverse pairs
//    ├── Return total count of reverse pairs

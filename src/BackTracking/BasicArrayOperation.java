package BackTracking;

public class BasicArrayOperation {
    public static void basicArrayOperation(int[] arr, int index, int value) {
        // base case
        if(index == arr.length){
            return;
        }
        arr[index] = value;
        basicArrayOperation(arr, index + 1, value+1);
        arr[index] = arr[index] - 1;
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        printArray(arr);
        System.out.println();
        System.out.println("After changing the array: ");
        basicArrayOperation(arr, 0, 1);
        printArray(arr);
    }
}

public class mergeSort {

    // Merges two subarrays of array[]: First subarray is array[l..m], second subarray is array[m+1..r]
    static void merge(int array[], int leftIndex, int midIndex, int rightIndex)
    {
        int leftArraySize = midIndex - leftIndex + 1;
        int rightArraySize = rightIndex - midIndex;

        // Create temporary arrays for left and right subarrays
        int leftArray[] = new int[leftArraySize];
        int rightArray[] = new int[rightArraySize];

        // Copy data to temporary arrays leftArray[] and rightArray[]
        for (int i = 0; i < leftArraySize; ++i)
            leftArray[i] = array[leftIndex + i];
        for (int j = 0; j < rightArraySize; ++j)
            rightArray[j] = array[midIndex + 1 + j];

        // Merge the temporary arrays back into the original array[]
        int i = 0, j = 0; // Initial indices for leftArray[] and rightArray[]
        int k = leftIndex; // Initial index for merged subarray

        // Merge the two subarrays into array[]
        while (i < leftArraySize && j < rightArraySize) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of leftArray[], if any
        while (i < leftArraySize) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy the remaining elements of rightArray[], if any
        while (j < rightArraySize) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Main function that sorts array[l..r] using merge()
    static void sort(int array[], int leftIndex, int rightIndex)
    {
        if (leftIndex < rightIndex) {
            int midIndex = leftIndex + (rightIndex - leftIndex) / 2;

            // Sort first and second halves
            sort(array, leftIndex, midIndex);
            sort(array, midIndex + 1, rightIndex);

            // Merge the sorted halves
            merge(array, leftIndex, midIndex, rightIndex);
        }
    }

    // Utility method to print an array
    static void printArray(int array[])
    {
        int length = array.length;
        for (int i = 0; i < length; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public static void main(String args[])
    {
        int array[] = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Given array is");
        printArray(array);

        sort(array, 0, array.length - 1);

        System.out.println("\nSorted array is");
        printArray(array);
    }
}

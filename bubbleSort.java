public class bubbleSort {

    // Bubble Sort algorithm
    static void bubbleSort(int array[], int length) {
        int currentIndex, nextIndex, temp;
        boolean isSwapped;

        // Outer loop: iterate through the entire array
        for (currentIndex = 0; currentIndex < length - 1; currentIndex++) {
            isSwapped = false;

            // Inner loop: compare adjacent elements and swap if needed
            for (nextIndex = 0; nextIndex < length - currentIndex - 1; nextIndex++) {
                // If the current element is greater than the next element, swap them
                if (array[nextIndex] > array[nextIndex + 1]) {
                    temp = array[nextIndex];
                    array[nextIndex] = array[nextIndex + 1];
                    array[nextIndex + 1] = temp;

                    isSwapped = true;
                }
            }

            // If no elements were swapped, the array is already sorted
            if (!isSwapped)
                break;
        }
    }

    // Method to print the array
    static void printArray(int array[], int size) {
        for (int i = 0; i < size; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int array[] = {4, 3, 10, 8, 9, 7, 1, 2, 5, 6};  // Unsorted array
        int length = array.length;  // Array size

        // Call bubbleSort to sort the array
        bubbleSort(array, length);

        // Print the sorted array
        System.out.println("Sorted array: ");
        printArray(array, length);
    }
}


// hello
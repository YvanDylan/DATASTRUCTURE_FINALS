class SortHeap {

    // To heapify a subtree rooted with node j
    // which is an index in values[].
    static void heapify(int values[], int size, int j) {

        // Initialize max as root
        int max = j;

        // left index = 2*j + 1
        int leftChild = 2 * j + 1;

        // right index = 2*j + 2
        int rightChild = 2 * j + 2;

        // If left child is larger than root
        if (leftChild < size && values[leftChild] > values[max]) {
            max = leftChild;
        }

        // If right child is larger than max so far
        if (rightChild < size && values[rightChild] > values[max]) {
            max = rightChild;
        }

        // If max is not root
        if (max != j) {
            int tempValue = values[j];
            values[j] = values[max];
            values[max] = tempValue;

            // Recursively heapify the affected sub-tree
            heapify(values, size, max);
        }
    }

    // Main function to perform heap sort
    static void heapSortArray(int values[]) {
        int arraySize = values.length;

        // Build heap (rearrange array)
        for (int j = arraySize / 2 - 1; j >= 0; j--) {
            heapify(values, arraySize, j);
        }

        // One by one extract an element from heap
        for (int j = arraySize - 1; j > 0; j--) {

            // Move current root to end
            int tempValue = values[0];
            values[0] = values[j];
            values[j] = tempValue;

            // Call max heapify on the reduced heap
            heapify(values, j, 0);
        }
    }

    // A utility function to print array of size size
    static void displayArray(int values[]) {
        for (int j = 0; j < values.length; j++) {
            System.out.print(values[j] + " ");
        }
        System.out.println();
    }

    // Driver's code
    public static void main(String args[]) {
        int values[] = {9, 4, 3, 8, 10, 2, 5};
        heapSortArray(values);
        System.out.println("Sorted array is ");
        displayArray(values);
    }
}


// hello

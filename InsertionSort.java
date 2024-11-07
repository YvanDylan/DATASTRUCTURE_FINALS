public class InsertionSort {

    void sort(int array[]) {
        int length = array.length;
        
        // Start from the second element (index 1)
        for (int currentIndex = 1; currentIndex < length; ++currentIndex) {
            int currentElement = array[currentIndex]; // The element to be inserted into the sorted portion
            int comparisonIndex = currentIndex - 1;   // Index to compare against the sorted portion of the array
            
            // Move elements of the sorted portion that are greater than currentElement
            while (comparisonIndex >= 0 && array[comparisonIndex] > currentElement) {
                array[comparisonIndex + 1] = array[comparisonIndex]; // Shift elements to the right
                comparisonIndex = comparisonIndex - 1;  // Move to the next element in the sorted portion
            }
            
            // Insert the currentElement into the correct position
            array[comparisonIndex + 1] = currentElement;
        }
    }

    // Print the elements of the array
    static void printArray(int array[]) {
        int length = array.length;
        for (int i = 0; i < length; ++i) {
            System.out.print(array[i] + " ");  // Print each element followed by a space
        }
        System.out.println();  // Newline after printing all elements
    }

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Initial sorted array
        
        InsertionSort sorter = new InsertionSort();  // Create an object of InsertionSort class
        sorter.sort(array);  // Sort the array
        
        printArray(array);  // Print the sorted array
    }
}


// hello

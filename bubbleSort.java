class bubbleSort {    
    static void bubbleSort(int array[], int n){
      int firstValue, secondValue, emptyRoom;
      boolean swapped;
      for (firstValue = 0; firstValue < n - 1; firstValue++) {
          swapped = false;
          for (secondValue = 0; secondValue < n - firstValue - 1; secondValue++) {
              if (array[secondValue] > array[secondValue + 1]) {                  
                 
                emptyRoom = array[secondValue];
                array[secondValue] = array[secondValue + 1];
                array[secondValue + 1] = emptyRoom;
                  swapped = true;
              }
          }        
          if (swapped == false)
              break;
      }
  }

  
  static void printArray(int arr[], int size){
      int i;
      for (i = 0; i < size; i++)
          System.out.print(arr[i] + " ");
      System.out.println();
  }


  public static void main(String args[]){
      int array[] = {4, 3, 10, 8, 9, 7, 1, 2, 5, 6};
      int n = array.length;
      bubbleSort(array, n);
      System.out.println("Sorted array: ");
      printArray(array, n);
  }
}

package SortingAlgorithms;

class InsertionSort {
    void insertionSort (int[] array) {
        for (int i = 1; i < array.length - 1; i++) {
            int j = i;
            while (j > 0 && array[j - 1] < array[j]) {
                int temp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = temp;
                j--;
            }
        }
    }
}

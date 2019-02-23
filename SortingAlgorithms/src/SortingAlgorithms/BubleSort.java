package SortingAlgorithms;

class BubleSort {

    void bubbleSort (int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length -i- 1; i++) {
                if (array[i] > array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }

    }
}

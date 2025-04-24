public class Sorter<T extends Comparable<T>> {
    public void insertionSort(T[] array) {
        for (int j = 1; j < array.length; j++) {
            T temp = array[j];
            int i = j - 1;
            while (i >= 0 && array[i].compareTo(temp) > 0) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = temp;
        }
    }
}


class Sort {

    <T extends Comparable<T>> void bubbleSort(T arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

public class sort_array {

    public static void main(String[] args) {
        Sort s = new Sort();
        Integer[] arr = {5, 2, 8, 1, 9};
        s.bubbleSort(arr);
        System.out.println("Sorted array:");
        for (Integer arr1 : arr) {
            System.out.print(arr1 + " ");
        }
        String[] arr2 = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};
        s.bubbleSort(arr2);
        System.out.println("\nSorted array:");
        for (String arr3 : arr2) {
            System.out.print(arr3 + " ");
        }
    }
}

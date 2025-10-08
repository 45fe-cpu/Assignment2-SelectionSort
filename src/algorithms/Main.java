package algorithms;

public class Main {
    public static void main(String[] args) {

        System.out.println("Running Selection Sort manually...\n");

        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Before sorting:");
        for (int n : arr) System.out.print(n + " ");
        System.out.println();

        // called code
        SelectionSort.selectionSort(arr);

        System.out.println("After sorting:");
        for (int n : arr) System.out.print(n + " ");
        System.out.println();
    }
}

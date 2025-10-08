package algorithms;

public class SelectionSort {

    // Tracks key operations for performance analysis
    static class Metrics {
        int comparisons = 0;
        int swaps = 0;
        int arrayAccesses = 0;
    }

    // Main sorting method
    public static void selectionSort(int[] arr) {
        if (arr == null || arr.length == 0) return; // quick validation

        Metrics m = new Metrics();
        int n = arr.length;
        boolean alreadySorted;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            alreadySorted = true;

            for (int j = i + 1; j < n; j++) {
                m.comparisons++;
                m.arrayAccesses += 2; // reading arr[j] and arr[minIndex]

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                    alreadySorted = false;
                }
            }

            // Swap only if a smaller element was found
            if (minIndex != i) {
                swap(arr, i, minIndex, m);
                alreadySorted = false;
            }

            // Early stop if no actual changes happened
            if (alreadySorted) break;
        }

        // Output operation statistics
        System.out.println("Comparisons: " + m.comparisons);
        System.out.println("Swaps: " + m.swaps);
        System.out.println("Array accesses: " + m.arrayAccesses);
    }

    // Helper method for swapping elements (updates metrics)
    private static void swap(int[] arr, int i, int j, Metrics m) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        m.swaps++;
        m.arrayAccesses += 4;
    }

    // Simple main method for local testing
    public static void main(String[] args) {
        int[] data = {64, 25, 12, 22, 11};

        System.out.print("Before: ");
        for (int n : data) System.out.print(n + " ");
        System.out.println();

        selectionSort(data);

        System.out.print("After:  ");
        for (int n : data) System.out.print(n + " ");
        System.out.println();
    }
}

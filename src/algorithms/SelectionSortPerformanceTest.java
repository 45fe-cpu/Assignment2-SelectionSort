package algorithms;

import java.util.Random;

public class SelectionSortPerformanceTest {

    private static int[] generateArray(int size) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100000);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] sizes = {100, 1000, 10000, 100000};

        System.out.println("Selection Sort Performance Test");
        System.out.println("-------------------------------");

        for (int n : sizes) {
            int[] arr = generateArray(n);

            long start = System.currentTimeMillis();
            SelectionSort.selectionSort(arr);
            long end = System.currentTimeMillis();

            long time = end - start;

            System.out.println("n = " + n + " → time = " + time + " ms");
            System.out.println("--------------------------------------");
        }
    }
}

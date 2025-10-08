package algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SelectionSortTest {

    @Test
    public void testBasicSort() {
        int[] arr = {64, 25, 12, 22, 11};
        int[] expected = {11, 12, 22, 25, 64};

        SelectionSort.selectionSort(arr);

        assertArrayEquals(expected, arr, "Array should be sorted in ascending order");
    }

    @Test
    public void testAlreadySorted() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};

        SelectionSort.selectionSort(arr);

        assertArrayEquals(expected, arr, "Already sorted array should remain unchanged");
    }

    @Test
    public void testReverseSorted() {
        int[] arr = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};

        SelectionSort.selectionSort(arr);

        assertArrayEquals(expected, arr, "Reverse sorted array should be sorted correctly");
    }

    @Test
    public void testSingleElement() {
        int[] arr = {7};
        int[] expected = {7};

        SelectionSort.selectionSort(arr);

        assertArrayEquals(expected, arr, "Single-element array should remain unchanged");
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        int[] expected = {};

        SelectionSort.selectionSort(arr);

        assertArrayEquals(expected, arr, "Empty array should remain unchanged");
    }

    @Test
    public void testDuplicates() {
        int[] arr = {5, 3, 3, 2, 2, 1};
        int[] expected = {1, 2, 2, 3, 3, 5};

        SelectionSort.selectionSort(arr);

        assertArrayEquals(expected, arr, "Array with duplicates should be sorted correctly");
    }

    @Test
    public void testNullArray() {
        // Just make sure it doesn’t crash
        int[] arr = null;
        assertDoesNotThrow(() -> SelectionSort.selectionSort(arr), "Null array should not throw exception");
    }
}

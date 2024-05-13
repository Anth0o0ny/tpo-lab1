package part2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class HeapTest {

    private HeapSort heapSort = new HeapSort();

        @Test
        @DisplayName("Check algorithm sort")
        public void testSorting() {
            assertArrayEquals(new int[]{22, 28, 30, 82, 159, 166, 166, 287, 289, 338, 365, 371, 444, 451, 520, 527, 567, 623, 676, 714, 719, 741, 771, 783, 818, 874, 884, 914, 960, 970, 983},
                    heapSort.sort(new int[]{444, 520, 166, 874, 676, 22, 338, 783, 365, 970, 623, 30, 287, 451, 914, 371, 741, 818, 527, 714, 166, 159, 960, 289, 567, 82, 771, 983, 719, 884, 28}));
        }

        @Test
        @DisplayName("Check empty sort")
        public void checkEmpty() {
            assertArrayEquals(new int[]{}, heapSort.sort(new int[]{}));
        }

        @Test
        @DisplayName("Check negative values sort")
        public void checkNegativeValues() {
            assertArrayEquals(new int[]{-5, -4, -3, -2, -1}, heapSort.sort(new int[]{-5, -1, -4, -3, -2}));
        }

        @Test
        @DisplayName("Check zeros sort")
        public void checkZerosValues() {
            assertArrayEquals(new int[]{0, 0, 0, 0, 0}, heapSort.sort(new int[]{0,0,0,0,0}));
        }

        @Test
        @DisplayName("Check algorithm heapify")
        public void testHeapify() {
            int[] arr = new int[]{5, 4, 2, 1, 3, 6};
            assertArrayEquals(new int[]{5, 4, 6, 1, 3, 2},
                    heapSort.heapify(arr, arr.length, arr.length/2 - 1));
        }

        @Test
        @DisplayName("Check empty heapify")
        void checkEmptyHeapify() {
            assertArrayEquals(new int[]{}, heapSort.heapify(new int[]{},0,0));
        }

        @Test
        @DisplayName("Check negative values heapify")
        void checkNegativeValuesHeapify() {
            int[] arr = new int[]{-5, -4, -6, -1, -3, -2};
            assertArrayEquals(new int[]{-5, -4, -2, -1, -3, -6}, heapSort.heapify(arr, arr.length, arr.length/2 - 1));
        }

        @Test
        @DisplayName("Check zeros heapify")
        void checkZerosValuesHeapify() {
            int[] arr = new int[]{0, 0, 0, 0, 0};
            assertArrayEquals(new int[]{0, 0, 0, 0, 0}, heapSort.heapify(arr, arr.length, arr.length/2 - 1));
        }
}

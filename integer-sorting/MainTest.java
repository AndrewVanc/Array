import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class MainTest {

    @Test
    public void testSortIntegers_EmptyArray() {
        int[] input = {};
        int[] expected = {};
        assertArrayEquals("Sorting  empty array should return an empty array", expected, Main.sortIntegers(input));
    }

    @Test
    public void testSortIntegers_SingleElement() {
        int[] input = {5};
        int[] expected = {5};
        assertArrayEquals("Sorting a single-element array should return the same array", expected, Main.sortIntegers(input));
    }

    @Test
    public void testSortIntegers_SortedArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals("Sorting an already sorted array should return the same array", expected, Main.sortIntegers(input));
    }

    @Test
    public void testSortIntegers_UnsortedArray() {
        int[] input = {5, 3, 8, 1, 2};
        int[] expected = {1, 2, 3, 5, 8};
        assertArrayEquals("Sorting an unsorted array should return a sorted array", expected, Main.sortIntegers(input));
    }
}



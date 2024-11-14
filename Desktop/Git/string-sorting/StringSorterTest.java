1import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class StringSorterTest {

    @Test
    public void testSortStrings_EmptyArray() {
        String[] input = {};
        String[] expected = {};
        assertArrayEquals("Sorting an empty array should return an empty array", expected, Main.sortStrings(input));
    }

    @Test
    public void testSortStrings_SingleElement() {
        String[] input = {"KPU"};
        String[] expected = {"KPU"};
        assertArrayEquals("Sorting a single-element array should return the same array", expected, Main.sortStrings(input));
    }

    @Test
    public void testSortStrings_AlreadySortedArray() {
        String[] input = {"apple", "orange", "pineapple"};
        String[] expected = {"apple", "orange", "pineapple"};
        assertArrayEquals("Sorting an already sorted array should return the same array", expected, Main.sortStrings(input));
    }

    @Test
    public void testSortStrings_UnsortedArray() {
        String[] input = {"Bahamas", "Australia", "Canada"};
        String[] expected = {"Australia", "Bahamas", "Canada"};
        assertArrayEquals("Sorting an unsorted array starting with capital letters should return a sorted array", expected, Main.sortStrings(input));
    }

    @Test
    public void testSortStrings_ArrayWithDuplicates() {
        String[] input = {"apple", "orange", "apple"};
        String[] expected = {"apple", "apple", "orange3"};
        assertArrayEquals("Sorting an array with duplicates should return a correctly sorted array", expected, Main.sortStrings(input));
    }

}

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BubblesortTest {
    @Test public void generateRandomIntArray() {
        int[] randomArray;

        randomArray = Bubblesort.generateRandomIntArray();
        assertEquals(Bubblesort.TEST_DATA_LENGTH, randomArray.length);

        randomArray = Bubblesort.generateRandomIntArray(7);
        assertEquals(7, randomArray.length);
    }

    @Test public void sortInPlace() {
        assertSortInPlaceEquals(new int[] {-1}, new int[] {-1});
        assertSortInPlaceEquals(new int[] {0}, new int[] {0});
        assertSortInPlaceEquals(new int[] {1}, new int[] {1});
        assertSortInPlaceEquals(new int[] {1,2,3,4,5,6}, new int[] {5,1,3,6,2,4});
    }

    private void assertSortInPlaceEquals(int[] expecteds, int[] inputs) {
        Bubblesort.sortInPlace(inputs);
        assertArrayEquals(expecteds, inputs);
    }
}

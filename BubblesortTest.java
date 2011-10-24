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
}

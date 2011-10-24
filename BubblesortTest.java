import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BubblesortTest {
    @Test public void generateRandomIntArray() {
        int[] randomArray = Bubblesort.generateRandomIntArray();
        assertEquals(Bubblesort.TEST_DATA_AMOUNT, randomArray.length);
    }
}

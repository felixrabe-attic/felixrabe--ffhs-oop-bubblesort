import java.util.*;

public class Bubblesort {
    public static final random = new Random();
    public static final TEST_DATA_AMOUNT = 20;

    public static int[] generateRandomIntArray() {
        int[] randomArray = new int[TEST_DATA_AMOUNT];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt();
        }
        return new int[0];
    }
}

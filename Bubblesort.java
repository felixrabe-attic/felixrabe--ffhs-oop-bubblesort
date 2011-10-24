import java.util.*;

/** Program that sorts an arbitrary array of integers using the bubble sort algorithm.
 *
 * @author Felix Rabe
 * @version 20111024
 */
public class Bubblesort {
    public static final Random random = new Random();
    public static final int TEST_DATA_LENGTH = 20;

    /** Generate a random array of integers.
     *
     * @return the generated array
     */
    public static int[] generateRandomIntArray() {
        return generateRandomIntArray(TEST_DATA_LENGTH);
    }

    /** Generate a random array of integers.
     *
     * @param length the length of the array to be generated
     * @return the generated array
     */
    public static int[] generateRandomIntArray(int length) {
        int[] randomArray = new int[length];
        for (int i = 0; i < length; i++) {
            randomArray[i] = random.nextInt();
        }
        return randomArray;
    }
}

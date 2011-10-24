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

    /** Sort the specified integer array in-place.  Uses the bubble sort algorithm
     *
     * @param array the array to sort
     */
    public static void sortInPlace(int[] array) {
        boolean hadToSwap;
        do {
            hadToSwap = false;
            for (int first = 0; first < array.length - 1; first++) {
                int second = first + 1;
                if (array[first] > array[second]) {
                    swap(array, first, second);
                    hadToSwap = true;
                }
            }
        } while(hadToSwap);
    }

    private static void swap(int[] array, int first, int second) {
        int tmp = array[first];
        array[first] = array[second];
        array[second] = tmp;
    }
}

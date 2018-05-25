
import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] a1 = {0, 2, 2};
        int[] a2 = {};

        System.out.println(Arrays.toString(mergeArrays(a1, a2)));
    }

    /**
     * Merges two given sorted arrays into one
     *
     * @param a1 first sorted array
     * @param a2 second sorted array
     * @return new array containing all elements from a1 and a2, sorted
     */
    public static int[] mergeArrays(int[] a1, int[] a2) {

        int[] b = new int[a1.length + a2.length];


        int j = 1;
        for (int i = 0; i < Math.min(a1.length, a2.length); i++) {
            if (a1[i] < a2[i]) {
                b[j] = a1[i];
                b[j + 1] = a2[i];
            } else {
                b[j] = a2[i];
                b[j + 1] = a1[i];
            }
            j += 2;
        }

        if (a1.length == 0) {
            b = a2;
        }
        if (a2.length == 0) {
            b = a1;
        }


        return b; // your implementation here
    }
}

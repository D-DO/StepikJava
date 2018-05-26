
import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] a1 = {21, 23, 24, 40, 75, 76, 78};
        int[] a2 = {10, 11, 41, 50, 65, 86, 98, 101};

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

        if (a1.length == 0) {
            return a2;
        }
        if (a2.length == 0) {
            return a1;
        }


        int[] b = new int[a1.length + a2.length];

        int j1 = 0;
        int j2 = 0;
        for (int i = 0; i < b.length; i++) {

            if (a1[j1] < a2[j2]) {
                b[i] = a1[j1++];
            } else {
                b[i] = a2[j2++];
            }

            if (j1 >= a1.length) {
                j2++;
            }
            if (j2 >= a2.length) {
                j1++;
            }
            if (j1 >= a1.length - 1) {
                j1 = a1.length - 1;
            }
            if (j2 >= a2.length - 1) {
                j2 = a2.length - 1;
            }

            if (i == b.length - 1) {
                if (a1[j1] > a2[j2]) {
                    b[i] = a1[j1];
                } else {
                    b[i] = a2[j2];
                }
            }

        }

        return b; // your implementation here
    }
}

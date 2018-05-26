
import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeArrays1 {
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


        int[] b = new int[a1.length + a2.length];

        int i = 0, j = 0;
        for (int k = 0; k < b.length; k++) {

            if (i > a1.length - 1) {
                int a = a2[j];
                b[k] = a;
                j++;
            } else if (j > a2.length - 1) {
                int a = a1[i];
                b[k] = a;
                i++;
            } else if (a1[i] < a2[j]) {
                int a = a1[i];
                b[k] = a;
                i++;
            } else {
                int a = a2[j];
                b[k] = a;
                j++;
            }
        }

        return b; // your implementation here
    }
}

//
//////    public static int[] mergeArrays(int[] a, int[] b) {
//////        int[] c= new int[a.length+b.length];
//////        for(int i=0,j=0;i+j<c.length;c[i+j]=i<a.length?(j<b.length?(a[i]<b[j]?a[i++]:b[j++]):a[i++]):b[j++]);
//////        return c;
//////    }

//    public static int[] mergeArrays(int[] a1, int[] a2) {
//        int n = a1.length, m = a2.length;
//        int i = 0, j = 0;
//        int[] array = new int[n + m];
//
//        while (i < n || j < m)
//            array[i + j] = (i < n && (j == m || a1[i] < a2[j])) ? a1[i++] : a2[j++];
//
//        return array;
//    }

//    public static int[] mergeArrays(int[] a1, int[] a2) {
//        int i = 0, j = 0;
//        int[] res = new int[a1.length + a2.length];
//
//        while (i < a1.length && j < a2.length)
//            res[i + j] = (a1[i] < a2[j]) ? a1[i++] : a2[j++];
//        while (i < a1.length)
//            res[i + j] = a1[i++];
//        while (j < a2.length)
//            res[i + j] = a2[j++];
//        return res;
//    }
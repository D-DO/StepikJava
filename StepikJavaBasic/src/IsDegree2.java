public class IsDegree2 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(-2));




//        char f = d.charAt(0);
//        System.out.println(f);

    }
    /**
     * Checks if given <code>value</code> is a power of two.
     *
     * @param value any number
     * @return <code>true</code> when <code>value</code> is power of two, <code>false</code> otherwise
     */
    public static boolean isPowerOfTwo(int value) {
        value=Math.abs(value);
        return (value != 0) && ((value & (value-1)) == 0); // you implementation here
    }
}

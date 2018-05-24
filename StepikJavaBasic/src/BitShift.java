public class BitShift {
    public static void main(String[] args) {

        System.out.println(flipBit(0,1));

       // printByte(11);
    }


    /**
     * Flips one bit of the given <code>value</code>.
     *
     * @param value     any number
     * @param bitIndex  index of the bit to flip, 1 <= bitIndex <= 32
     * @return new value with one bit flipped
     */
    public static int flipBit(int value, int bitIndex) {

//   value = value ^ (1<<(bitIndex-1));

        return value ^ (1<<(bitIndex-1));  // put your implementation here
    }


    public static int  rrr(int intt, int sh){



       return  intt;
    }
    private static void printByte(int value) {

        String currentBinary = Integer.toBinaryString( value);
        System.out.println(currentBinary);
      char[] a =  currentBinary.toCharArray();
        for (char d:a ) {
            System.out.println(d);
        }
        System.out.println("");
        char[] b = new char[32];
        for (int i = 0; i < b.length; i++) {
            b[i]='0';

        }

        for (int i = 0; i < a.length; i++) {
            b[i]=a[i];

        }
        for (char d:b ) {
            System.out.println(d);
        }

         currentBinary = Integer.toBinaryString(2147483646 + value);
        System.out.println(currentBinary);
       // int bin = String.valueOf(currentBinary);

        System.out.println(currentBinary.substring(currentBinary.length() -31));
    }
}

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(1));

    }

    /**
     * Calculates factorial of given <code>value</code>.
     *
     * @param value positive number
     * @return factorial of <code>value</code>
     */
    public static BigInteger factorial(int value) {
        if (value == 0) return BigInteger.valueOf(1);
        BigInteger big = BigInteger.valueOf(value);
        while (value > 1) {
            big = big.multiply(BigInteger.valueOf(value - 1));
            value--;
        }
        return big;
    }

}

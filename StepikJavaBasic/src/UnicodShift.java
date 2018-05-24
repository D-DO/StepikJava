public class UnicodShift {
    public static void main(String[] args) {

        System.out.println( charExpression(2));

        String s = Double.toString(1e-5);

        System.out.println(s);
    }
    public static char charExpression(int a) {
        return (char) ('\\' + a);
    }
}

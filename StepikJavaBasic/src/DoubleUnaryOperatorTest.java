import java.util.function.DoubleUnaryOperator;

public class DoubleUnaryOperatorTest {
    public static void main(String[] args) {

        System.out.println(integrate(x -> Math.sin(x)/ x , 1, 5));

    }

    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double result, h;
        int n =10000000;
        result = 0;

        h = (b - a) / n; //Шаг сетки

        for(int i = 0; i < n; i++)
        {
            result += f.applyAsDouble(a + h * i); //Вычисляем в левой точке и добавляем в сумму
        }

        result *= h;

        return result;
      //  return f.applyAsDouble(a);
    }

}

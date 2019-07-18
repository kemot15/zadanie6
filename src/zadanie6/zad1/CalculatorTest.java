package zadanie6.zad1;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int[] numbers = calculator.getNumbers();
        System.out.println(calculator.checkNumbers(numbers));
    }
}

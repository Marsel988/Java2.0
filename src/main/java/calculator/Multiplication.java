package calculator;

public class Multiplication implements Operation{
    @Override
    public float calculateResult(float number1, float number2) {
        return number1 * number2;
    }
}

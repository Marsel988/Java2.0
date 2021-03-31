package calculator;

public class Division implements Operation {
    @Override
    public float calculateResult(float number1, float number2) throws ArithmeticException {
        float result = 0;
        try {
            result = number1 / number2;
        } catch (ArithmeticException e) {
            System.out.println("Ошибка вычисления. Деление на ноль запрещено...");
        }
        return result;
    }
}

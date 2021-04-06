package calculator;

public class Calculate {
    static Addition addition = new Addition();
    static Substraction substraction = new Substraction();
    static Multiplication multiplication = new Multiplication();
    static Division division = new Division();
    public static float calculate(float numberOne, float numberTwo, char operation) {
        float result = 0;
        switch (operation) {
            case '+':
                result = addition.calculateResult(numberOne, numberTwo);
                break;
            case '-':
                result = substraction.calculateResult(numberOne, numberTwo);
                break;
            case '*':
                result = multiplication.calculateResult(numberOne, numberTwo);
                break;
            case '/':
                result = division.calculateResult(numberOne, numberTwo);
                break;
            default:
                System.out.println("Введенная операция не поддерживается. Повторите ввод...");
                result = 0;
        }
        return result;
    }
}

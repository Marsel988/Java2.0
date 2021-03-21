package calculator;

import java.util.Scanner;

import static calculator.Calculate.calculate;

public class CalculatorNew {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        float numberOne, numberTwo, result;
        numberOne = getNumber();
        numberTwo = getNumber();
        char operation = chooseOperation();

        result = calculate(numberOne, numberTwo, operation);
        System.out.printf("Результат вычисления: %.2f", result);
    }

    public static float getNumber() {
        System.out.println("Введите число");
        float number;
        try {
            number = scanner.nextFloat();
        } catch (Exception e) {
            System.out.println("Ошибка при вводе. Попробуйте еще раз.");
            scanner.next();
            number = getNumber();
        }
        return  number;
    }

    public static char chooseOperation() {
        System.out.println("Введите операцию");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Ошибка при вводе. Повторите ввод...");
            scanner.next();
            operation = chooseOperation();
        }
        return operation;
    }



}

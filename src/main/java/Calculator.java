import java.util.Scanner;

/**
 * @author gizatullin-mn
 * @see #calculate(float, float, String)
 * @see #massProgram(String[])
 */
public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите номер задания:\n 1 - Калькулятор \n 2 - Поиск максимума в массиве слов");
        int choiceProgram = scanner.nextInt();
        if (choiceProgram == 1) {
            System.out.println("Введите первое число:");
            float number1 = scanner.nextFloat();
            System.out.println("Введите оперцию:");
            String operation = scanner.next();
            System.out.println("Введите второе число:");
            float number2 = scanner.nextFloat();
            System.out.printf("Результат вычисления: %.4f", calculate(number1, number2, operation));
        } else if (choiceProgram == 2) {
            System.out.println("Введите целочисленную размерность массива:");
            int massSize = scanner.nextInt();
            String[] strings = new String[massSize];
            System.out.println("Введите слова:");
            for (int i = 0; i < massSize; i++) {
                String word = scanner.next();
                strings[i] = word;
            }
            massProgram(strings);
        } else System.out.println("Введенное задание не реализовано");
        scanner.close();
    }

    /**
     * @param x1        first number
     * @param x2        second number
     * @param operation mathematical operation (+,-,/,*)
     * @return result float number (operation result)
     */
    public static float calculate(float x1, float x2, String operation) {
        Scanner scanner = new Scanner(System.in);
        float result = 0;
        switch (operation) {
            case "*":
                result = x1 * x2;
                break;
            case "/":
                if(x2 == 0){
                    System.out.println("Деление на ноль");
                    break;
                }
                result = x1 / x2;
                break;
            case "+":
                result = x1 + x2;
                break;
            case "-":
                result = x1 - x2;
                break;
            default:
                System.out.println("Введенная операция не поддерживается");
        }
        return result;
    }

    /**
     * @param strings mass of words
     */
    public static void massProgram(String[] strings) {
        int wordLength = 0;
        String longestWord = null;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() >= wordLength) {
                longestWord = strings[i];
                wordLength = strings[i].length();
            }
        }
        System.out.printf("Самое длинное слово: %s\nКоличество символов: %d \n", longestWord, wordLength);
    }
}




package homework.lectures.lecture1;
//**********@Checked***************//
import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MathOperationsDemo {
    static int valueA, valueB;
    static String valueOperation;
    private static final Logger log = Logger.getLogger(MathOperationsDemo.class);

    public static void main(String[] args) throws IOException {
        consoleEnters();
        operationOfCalculator(valueA, valueB, valueOperation);
    }

    private static void consoleEnters() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        log.info("Введите число a: ");
        valueA = Integer.parseInt(bufferedReader.readLine());
        log.info("Выберите оператор: \n  +   -   /   * ");
        valueOperation = bufferedReader.readLine();
        log.info("Введите число b: ");
        valueB = Integer.parseInt(bufferedReader.readLine());
    }

    private static void operationOfCalculator(int a, int b, String operator) {
        switch (operator) {
            case "+":
                log.info("Сумма числа " + a + " и " + b + " = ");
                int additionValue = a + b;
                System.out.print(additionValue);
                break;
            case "-":
                log.info("Разница чисел " + a + " и " + b + " = ");
                int differenceValue = a - b;
                System.out.print(differenceValue);
                break;
            case "/":
                if (b != 0) {
                    log.info("Частное чисел " + a + " и " + b + " = ");
                    double quotientValue = (double) a / b;
                    System.out.print(quotientValue);
                } else {
                    log.info("Деление на ноль невозможно");
                }
                break;
            case "*":
                log.info("Произведение чисел " + a + " и" + b + " = ");
                int multiplicationValue = a * b;
                System.out.print(multiplicationValue);
                break;
            default:
                log.info("Ошибка. Неизвестный оператор");
        }
    }
}

package homework.lectures.lecture1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MathOperationsDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( System.in ) );
        System.out.println( "Выберите введите число a: " );
        int valueA = Integer.parseInt( bufferedReader.readLine( ) );
        System.out.println( "выберите оператор: + - / * " );
        String valueOperation = bufferedReader.readLine( );
        System.out.println( "Выберите введите число b: " );
        int valueB = Integer.parseInt( bufferedReader.readLine( ) );
        operationAddition( valueA, valueB, valueOperation );
    }

    private static void operationAddition(int a, int b, String operator) {
        switch (operator) {
            case "+":
                System.out.println( "Сумма числа " + a + " и " + b + " = " );
                int additionValue = a + b;
                System.out.print( additionValue );
                break;
            case "-":
                System.out.println( "Разница чисел " + a + " и " + b + " = " );
                int differenceValue = a - b;
                System.out.print( differenceValue );
                break;
            case "/":
                if ( b != 0 ) {
                    System.out.println( "Частное чисел " + a + " и " + b + " = " );
                    double quotientValue = (double) a / b;
                    System.out.print( quotientValue );
                } else {
                    System.out.println( "Деление на ноль невозможно" );
                }
                break;
            case "*":
                System.out.println( "Произведение чисел " + a + " и" + b + " = " );
                int multiplicationValue = a * b;
                System.out.print( multiplicationValue );
                break;
            default:
                System.out.println( "Ошибка. Неизвестный оператор" );
        }
    }
}

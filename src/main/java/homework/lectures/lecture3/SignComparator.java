package homework.lectures.lecture3;

import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SignComparator {
    private static final Logger log = Logger.getLogger(SignComparator.class);
    private static String result;

    public static void main(String[] args) throws IOException {
        var number = bufferReaderEnters();
        result = compare(number);
        log.info(result);
    }

    public static int bufferReaderEnters() throws IOException {
        int number = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            log.info("Enter a number for check: ");
            number = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        reader.close();
        return number;
    }

    public static String compare(int number) {
        String typeOfInteger;

        if (number > 0) {
            typeOfInteger = "Number is positive";
        } else if (number < 0) {
            typeOfInteger = "Number is negative";
        } else {
            typeOfInteger = "Number is equal to zero";
        }
        return typeOfInteger;
    }


    public static String getResult() {
        return result;
    }

    public static void setResult(String result) {
        SignComparator.result = result;
    }
}

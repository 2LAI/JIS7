package homework.lectures.utils.functions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadLineConsole {

    public static String consoleReadline() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        try {
            s = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }
}
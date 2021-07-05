package homework.lectures.core.lecture4;

import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static homework.lectures.core.lecture4.Errors.*;

public class UserValidationService {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static final Logger log = Logger.getLogger(UserValidationService.class);

    public static void main(String[] args) throws IOException {
        validate(new User());
    }

    public static void validate(User user) throws IOException {
        System.out.println(user.toString());
        log.info("Enter age");
        setUserAge(user);
        log.info("Enter first name");
        setUserFirstName(user);
        log.info("Enter last name");
        setUserLastName(user);
        log.info(user.toString());
    }


    private static void setUserFirstName(User user) throws IOException {
        String userFirstName = reader.readLine();
        try {
            if (userFirstName.length() < 3 | userFirstName.length() > 15)
                throw new UserValidationException(FIRST_NAME_ERROR.label);
            user.setFirstName(userFirstName);
        } catch (UserValidationException e) {
            log.info(e.getMessage());
            setUserFirstName(user);
        }
    }

    private static void setUserLastName(User user) throws IOException {
        String userLastName = reader.readLine();
        try {
            if (userLastName.length() < 3 | userLastName.length() > 15)
                throw new UserValidationException(LAST_NAME_ERROR.label);
            user.setLastName(userLastName);
        } catch (UserValidationException e) {
            log.info(e.getMessage());
            setUserLastName(user);
        }
    }

    private static void setUserAge(User user) throws IOException {
        int userAge = Integer.parseInt(reader.readLine());
        try {
            if (userAge < 0 | userAge > 120) throw new UserValidationException(AGE_ERROR.label);
            user.setAge(userAge);
        } catch (UserValidationException e) {
            log.info(e.getMessage());
            setUserAge(user);
        }
    }


}

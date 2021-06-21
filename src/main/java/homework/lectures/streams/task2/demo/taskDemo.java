package homework.lectures.streams.task2.demo;

import homework.lectures.streams.task2.logic.ChangeUserStatus;
import homework.lectures.streams.task2.repository.UserRepository;
import org.apache.log4j.Logger;

public class taskDemo {

    private static final Logger log = Logger.getLogger(UserRepository.class);

    public static void main(String[] args) {
        var userList = UserRepository.getUserList();
        log.info(userList + "\n");

        ChangeUserStatus.updateUserStatus(userList);
        log.info("After user updates:");
        log.info(userList + "\n");

        var adultUsersList = ChangeUserStatus.userStatusChangeByAge(userList);
        log.info("User list after user age updates:");
        log.info(userList + "\n");
        log.info("Adult user list:");
        log.info(adultUsersList + "\n");
    }
}


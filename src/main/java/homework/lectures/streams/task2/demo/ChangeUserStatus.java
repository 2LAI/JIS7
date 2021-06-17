package homework.lectures.streams.task2.demo;

import homework.lectures.streams.task2.model.User;
import homework.lectures.streams.task2.model.UserStatus;

import java.util.List;

public class ChangeUserStatus {

    public static void changeGuestStatusToUser(List<User> userList) {

        userList.stream()
                .filter(guest -> guest.getUserStatus().equals(UserStatus.GUEST))
                .forEach(guest -> guest.setUserStatus(UserStatus.USER));

    }
}

package homework.lectures.streams.task2.demo;

import homework.lectures.streams.task2.model.User;
import homework.lectures.streams.task2.model.UserStatus;

import java.util.List;

public class ChangeUserStatus {

    public static void changeGuestStatusToUser(List<User> userList) {
        userList.stream()
                .filter(guest -> guest.getUserStatus().equals(UserStatus.GUEST))
                .forEach(ChangeUserStatus::changeStatusAndFlagGuest);
    }

    private static void changeStatusAndFlagGuest(User guest) {
        guest.setUserStatus(UserStatus.USER);
        guest.setActive(true);
    }

    public static void changeUserStatusToVip(List<User> userList) {
        userList.stream()
                .filter(user -> user.getUserStatus().equals(UserStatus.USER))
                .forEach(user -> user.setUserStatus(UserStatus.VIP_USER));
    }


}

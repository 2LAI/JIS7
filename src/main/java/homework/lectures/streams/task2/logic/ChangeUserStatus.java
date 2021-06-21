package homework.lectures.streams.task2.logic;

import homework.lectures.streams.task2.model.User;
import homework.lectures.streams.task2.model.UserStatus;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ChangeUserStatus {

    public static void updateUserStatus(List<User> userList) {
        userList.forEach(userStatusChange());
    }

    private static Consumer<User> userStatusChange() {
        return user -> {
            if (user.getUserStatus().equals(UserStatus.GUEST)) {
                user.setUserStatus(UserStatus.USER);
                user.setActive(true);
            } else if (user.getUserStatus().equals(UserStatus.USER))
                user.setUserStatus(UserStatus.VIP_USER);
        };
    }

    public static List<User> userStatusChangeByAge(List<User> userList) {
        return userList.stream()
                .sorted(Comparator.comparing(User::getNickName))
                .peek(changeUserStatusAndFlag())
                .filter(user -> user.getAge() > 18)
                .collect(Collectors.toList());
    }

    private static Consumer<User> changeUserStatusAndFlag() {
        return user -> {
            if (user.getAge() < 18) {
                user.setUserStatus(UserStatus.GUEST);
                user.setActive(false);
            }
        };
    }
}

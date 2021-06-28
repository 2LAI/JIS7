package homework.lectures.streams.task2.repository;

import homework.lectures.streams.task2.model.User;
import homework.lectures.streams.task2.model.UserStatus;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    public static List<User> getUserList() {
        List<User> userList = new ArrayList<>();
        userList.add(new User(0, "Alexandr", "Tulai", 25, "2lai", true, UserStatus.VIP_USER));
        userList.add(new User(1, "Kiril", "Mokedonskij", 17, "k2", false, UserStatus.GUEST));
        userList.add(new User(2, "Kiril", "Chernij", 21, "k1", true, UserStatus.USER));
        userList.add(new User(3, "Dmitryj", "Mel", 16, "DMel", true, UserStatus.USER));
        userList.add(new User(4, "Ekaterina", "Krasikova", 20, "EK2F4", false, UserStatus.GUEST));
        return userList;
    }
}

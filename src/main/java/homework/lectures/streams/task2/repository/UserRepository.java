package homework.lectures.streams.task2.repository;

import homework.lectures.streams.task2.demo.ChangeUserStatus;
import homework.lectures.streams.task2.model.User;
import homework.lectures.streams.task2.model.UserStatus;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        userList.add(new User(0, "Alexandr", "Tulai", "2lai", true, UserStatus.VIP_USER));
        userList.add(new User(1, "Kiril", "Mokedonskij", "k2", false, UserStatus.GUEST));
        userList.add(new User(2, "Kiril", "Chernij", "k1", true, UserStatus.USER));
        userList.add(new User(3, "Dmitryj", "Mel", "DMel", true, UserStatus.USER));
        userList.add(new User(4, "Ekaterina", "Krasikova", "EK2F4", false, UserStatus.GUEST));

        System.out.println(userList);
        System.out.println("After sorted\n");
        ChangeUserStatus.changeGuestStatusToUser(userList);
        System.out.println(userList);
    }
}

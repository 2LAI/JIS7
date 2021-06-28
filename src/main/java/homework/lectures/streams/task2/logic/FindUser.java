package homework.lectures.streams.task2.logic;

import homework.lectures.streams.task2.model.User;
import homework.lectures.streams.task2.model.UserStatus;

import java.util.List;

public class FindUser {

    public static long countUsers (List<User> userList){
        return userList.stream()
                .filter(user -> user.getUserStatus().equals(UserStatus.USER) && user.isActive()).count();
    }
}

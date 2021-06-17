package homework.lectures.streams.task2.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private int id;
    private String firsName;
    private String lastName;
    private String nickName;
    boolean isActive;
    UserStatus userStatus;

}

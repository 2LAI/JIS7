package homework.lectures.streams.task2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Integer id;
    private String firsName;
    private String lastName;
    private Integer age;
    private String nickName;
    boolean isActive;
    UserStatus userStatus;

}

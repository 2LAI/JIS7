package homework.lectures.streams.task2.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Integer id;
    private String firsName;
    private String lastName;
    private String nickName;
    boolean isActive;
    UserStatus userStatus;

}

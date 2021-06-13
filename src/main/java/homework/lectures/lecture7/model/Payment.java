package homework.lectures.lecture7.model;

import homework.lectures.lecture7.data.StatusOfPayment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Payment {

    private Doctor doctor;
    private Patient patient;
    private String timePayment;
    private StatusOfPayment statusOfPayment;

}

package homework.lectures.core.lecture7.model;

import homework.lectures.core.lecture7.data.StatusOfPayment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Payment {

    private Doctor doctor;
    private Patient patient;
    private String timePayment;
    private StatusOfPayment statusOfPayment;

}

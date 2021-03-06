package homework.lectures.core.lecture7.model;

import homework.lectures.core.lecture7.data.DoctorTypes;
import homework.lectures.core.lecture7.data.Schedule;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {

    private String doctorName;
    private DoctorTypes doctorTypes;
    private Schedule [] schedule;

}

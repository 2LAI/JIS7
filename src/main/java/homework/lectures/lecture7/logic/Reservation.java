package homework.lectures.lecture7.logic;

import homework.lectures.lecture7.data.Schedule;
import homework.lectures.lecture7.model.Doctor;
import homework.lectures.lecture7.model.Patient;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor

public class Reservation {
    public static Map<Patient, Map<Schedule, List<Doctor>>> reservation = new HashMap<>();

}



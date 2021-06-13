package homework.lectures.lecture7.initial;

import homework.lectures.lecture5.task2.ItemNotFoundException;
import homework.lectures.lecture7.data.DoctorTypes;
import homework.lectures.lecture7.data.Schedule;
import homework.lectures.lecture7.data.StatusOfPayment;
import homework.lectures.lecture7.logic.Reservation;
import homework.lectures.lecture7.model.Doctor;
import homework.lectures.lecture7.model.Patient;
import homework.lectures.lecture7.model.Payment;

import java.util.*;


public class InitialDoctorAndPatient {

    public static void main(String[] args) {

        List<Doctor> doctorList = new ArrayList<Doctor>();
        doctorList.add(new Doctor("Alexey Popov", DoctorTypes.SURGEON, Schedule.values()));
        doctorList.add(new Doctor("Alexandr Ivanov", DoctorTypes.DENTIST, Schedule.values()));
        doctorList.add(new Doctor("Kristina Lavrova", DoctorTypes.OPHTHALMOLOGIST, Schedule.values()));

        List<Patient> patientList = new ArrayList<Patient>();
        patientList.add(new Patient("Alexandr", "Tulai"));
        patientList.add(new Patient("Dmitrij", "Mok"));
        patientList.add(new Patient("Violetta", "Maximova"));

        List<Payment> paymentsList = new ArrayList<>();
        paymentsList.add(new Payment(doctorList.get(0), patientList.get(0), "11:00", StatusOfPayment.PAID));
        paymentsList.add(new Payment(doctorList.get(1), patientList.get(1), "12:00", StatusOfPayment.PAID));

        try {
            reserveTimeOfDoctor(doctorList.get(0), patientList.get(0), Schedule.ELEVEN, paymentsList.get(1));
        } catch (ItemNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(Reservation.reservation.toString());
    }

    public static void reserveTimeOfDoctor(Doctor doctor, Patient patient, Schedule schedule, Payment payment) throws ItemNotFoundException {
        if (payment.getStatusOfPayment().equals(StatusOfPayment.PAID)) {
            reserve(doctor, patient, schedule, payment);
        } else throw new ItemNotFoundException("Not paid, please check your payment: " + payment.getStatusOfPayment());
    }

    private static void reserve(Doctor doctor, Patient patient, Schedule schedule, Payment payment) {
        Map timeOfDoctors = new HashMap();
        timeOfDoctors.put(schedule, doctor);
        Reservation.reservation.put(patient, timeOfDoctors);
    }


}

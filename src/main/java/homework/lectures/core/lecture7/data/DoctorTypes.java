package homework.lectures.core.lecture7.data;

public enum DoctorTypes {
    DENTIST("Дантист"),
    SURGEON("Хирург"),
    OPHTHALMOLOGIST("Офтальмолог"),
    THERAPIST("Терапевт");

    String type;

    DoctorTypes(String type) {
        this.type = type;
    }

    public String getDoctorType() {
        return type;
    }
}

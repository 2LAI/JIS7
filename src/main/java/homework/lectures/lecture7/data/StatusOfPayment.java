package homework.lectures.lecture7.data;

public enum StatusOfPayment {
    PAID("Оплачено"),
    NOT_PAID("Не оплачено"),
    EXPECTED("Ожидается оплата");

    String schedule;

    StatusOfPayment(String schedule) {
        this.schedule = schedule;
    }

    public String getSchedule() {
        return schedule;
    }
}

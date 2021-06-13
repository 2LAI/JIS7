package homework.lectures.lecture7.data;

public enum Schedule {
    TEN("10:00"),
    ELEVEN("11:00"),
    FOURTEEN("14:00"),
    FIFTEEN("15:00");

    public String schedule;

    Schedule(String schedule) {
        this.schedule = schedule;
    }

    public String getSchedule() {
        return schedule;
    }


}

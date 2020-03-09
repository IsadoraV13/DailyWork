public enum WeeklySchedule {
    MON("HIIT", "rest"),
    TUE("sleep","strength"),
    WED("yoga", "study"),
    THU("HIIT", "study" ),
    FRI("study", "chill"),
    SAT("yoga", "chill"),
    SUN("yoga", "meditation");

    String morningSchedule;
    String daySchedule;
    String eveningSchedule;

    WeeklySchedule(String morningSchedule, String eveningSchedule) {
        this.morningSchedule = morningSchedule;
        this.daySchedule = "study";
        this.eveningSchedule = eveningSchedule;
    }

    public String getMorningSchedule() {
        return morningSchedule;
    }

    public String getDaySchedule() {
        return daySchedule;
    }

    public String getEveningSchedule() {
        return eveningSchedule;
    }
}

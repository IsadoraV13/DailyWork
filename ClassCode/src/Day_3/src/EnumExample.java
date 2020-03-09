public class EnumExample {
    public static void main(String[] args) {
        WeeklySchedule scheduleToday = WeeklySchedule.WED;
        System.out.println("Today, I will do the following: " + scheduleToday.getMorningSchedule() + ", " +
                scheduleToday.getDaySchedule() + ", " + scheduleToday.getEveningSchedule() + ". ");
    }
}

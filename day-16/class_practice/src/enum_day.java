
enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

public class enum_day {

    public static void main(String[] args) {
        Day today = Day.FRIDAY;
        System.out.println("Today is: " + today);

        switch (today) {
            case MONDAY -> System.out.println("Starting wark in day");
            case TUESDAY -> System.out.println("Tuesday is very tired");
            case WEDNESDAY -> System.out.println("Wednesday is a sleepy");
            case THURSDAY -> System.out.println("Thursday is a i have done");
            case FRIDAY -> System.out.println("Friday is a please no more");
            case SATURDAY -> System.out.println("Saturday is a start holiday");
            case SUNDAY -> System.out.println("Sunday is a happy happy day");
            default -> System.out.println("It's not a holiday you die");
        }
    }
}

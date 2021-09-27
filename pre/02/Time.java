public class Time {
    public static void main(String[] args) {
        int hour = 20;
        int minute = 10;
        int second = 45;

        int secondsElapsed = hour * 3600 + minute * 60 + second;
        System.out.println("Seconds elapsed since midnight: " + secondsElapsed);

        int secondsRemaining = (24 - hour) * 3600 + (60 - minute) * 60 + (60 - second);
        System.out.println("Seconds remaining until midnight: " + secondsRemaining);

        float percentageOfDayElapsed = (float) secondsElapsed / (24 * 3600);
        System.out.println("Percentage of day elapsed: " + percentageOfDayElapsed * 100 + "%");
    }
}
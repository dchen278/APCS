import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of seconds:");
        int seconds = scanner.nextInt();

        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int sec = seconds % 60;

        System.out.println(seconds + " seconds = " + hours + " hours, " + minutes + " minutes, " + "and " + sec + " seconds");
    }
}

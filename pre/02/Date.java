public class Date {
    public static void main(String[] args) {
        String date = "Thursday";
        String month = "July";
        int day = 23;
        int year = 2015;
        System.out.println("American Format:");
        System.out.println(date + ", " + month + " " + day + ", " + year);

        System.out.println("European Format:");
        System.out.println(date + " " + day + " " + month + " " + year);
    }
}

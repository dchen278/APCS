public class StatsDriver {
    public static void main(String args[]) {
        System.out.println(Stats.mean(6, 7));
        System.out.println("This should be 6");
        System.out.println(Stats.mean(6, 0));
        System.out.println("This should be 3");
        System.out.println(Stats.mean(-2, 31));
        System.out.println("This should be 14");

        System.out.println(Stats.mean(6.0, 7.0));
        System.out.println("This should be 6.5");
        System.out.println(Stats.mean(3.23, 5.24));
        System.out.println("This should be 4.235");
        System.out.println(Stats.mean(0.0, 12.5));
        System.out.println("This should be 6.25");
        System.out.println(Stats.mean(6.5, 7));
        System.out.println("This should be 6.75");
        System.out.println(Stats.mean(7, 6.5));
        System.out.println("This should be 6.75");
        System.out.println(Stats.mean(-3.94, -5.2));
        System.out.println("This should be -4.57");

        System.out.println(Stats.max(-3, 7));
        System.out.println("This should be 7");
        System.out.println(Stats.max(7, -3));
        System.out.println("This should be 7");
        System.out.println(Stats.max(10, 31));
        System.out.println("This should be 31");
        System.out.println(Stats.max(-12, -45));
        System.out.println("This should be -12");
        System.out.println(Stats.max(5, 5));
        System.out.println("This should be 5");

        System.out.println(Stats.max(4.5, 10.33));
        System.out.println("This should be 10.33");
        System.out.println(Stats.max(10.4, -33.93));
        System.out.println("This should be 10.4");
        System.out.println(Stats.max(-54.65, -87.13));
        System.out.println("This should be -54.65");
        System.out.println(Stats.max(72.34, 72.34));
        System.out.println("This should be 72.34");

        System.out.println(Stats.geoMean(3, 3));
        System.out.println("This should be 3");
        System.out.println(Stats.geoMean(2, 8));
        System.out.println("This should be 4");
        System.out.println(Stats.geoMean(-2, 2));
        System.out.println("This should be ??");
        System.out.println(Stats.geoMean(-5, -5));
        System.out.println("This should be 5");
        System.out.println(Stats.geoMean(20, 4));
        System.out.println("This should be 8");

        System.out.println(Stats.geoMean(2.0, 2.0));
        System.out.println("This should be 2.0");
        System.out.println(Stats.geoMean(2.4, 9.6));
        System.out.println("This should be 4.8");

    }

}
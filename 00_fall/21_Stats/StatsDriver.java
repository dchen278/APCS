/*
Downtown Leopard Rocks: David Chen, Lea Kwok, Raven Tang
APCS
HW21: STAtisTically Speaking..../developing corresponding skeleton for StatsDriver developed in class
10-20-2021
DISCO
 - We can convert a double into a long and then into a int by using Math.round twice
QCC
 - Is there a way to write the geoMean method without the Math class?
*/

public class StatsDriver {
    public static void main(String args[]) {
        // test int mean(a,b)
        System.out.println(Stats.mean(6, 7));
        System.out.println("This should be 6");
        System.out.println(Stats.mean(6, 0));
        System.out.println("This should be 3");
        System.out.println(Stats.mean(-2, 31));
        System.out.println("This should be 14");

        // test double mean(a,b)
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

        // test int max(a,b)
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

        // test double max(a,b)
        System.out.println(Stats.max(4.5, 10.33));
        System.out.println("This should be 10.33");
        System.out.println(Stats.max(10.4, -33.93));
        System.out.println("This should be 10.4");
        System.out.println(Stats.max(-54.65, -87.13));
        System.out.println("This should be -54.65");
        System.out.println(Stats.max(72.34, 72.34));
        System.out.println("This should be 72.34");

        // test int geoMean(a,b)
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

        // test double geoMean(a,b)
        System.out.println(Stats.geoMean(2.0, 2.0));
        System.out.println("This should be 2.0");
        System.out.println(Stats.geoMean(2.4, 9.6));
        System.out.println("This should be 4.8");

        // test int max(a,b,c)
        System.out.println(Stats.max(12, 34, 67));
        System.out.println("This should be 67");
        System.out.println(Stats.max(-34, 15, 73));
        System.out.println("This should be 73");
        System.out.println(Stats.max(-67, -23, 56));
        System.out.println("This should be 56");
        System.out.println(Stats.max(42, 42, 78));
        System.out.println("This should be 78");
        System.out.println(Stats.max(16, 16, 16));
        System.out.println("This should be 16");

        // test double max(a,b,c)
        System.out.println(Stats.max(23.2, 32.2, 232.2));
        System.out.println("This should be 232.2");
        System.out.println(Stats.max(-34.42, -893.3, 23.2));
        System.out.println("This should be 23.2");

        // test int geoMean(a,b,c)
        System.out.println(Stats.geoMean(4, 8, 2));
        System.out.println("This should be 4");
        System.out.println(Stats.geoMean(-4, -8, -2));
        System.out.println("This should be -4");
        System.out.println(Stats.geoMean(5, -8, 25));
        System.out.println("This should be -10");
        System.out.println(Stats.geoMean(-7, -6, 3));
        System.out.println("This should be 5");

        // test double geoMean(a,b,c)
        System.out.println(Stats.geoMean(4.4, 8.3, 2.7));
        System.out.println("This should be 4.6199");
        System.out.println(Stats.geoMean(-5.2, 7.6, 8.3));
        System.out.println("This should be -6.8965");
        System.out.println(Stats.geoMean(-6.3, -2.7, 8.5));
        System.out.println("This should be 5.2486");
        System.out.println(Stats.geoMean(-5.6, -3.7, -8.2));
        System.out.println("This should be -5.5386");

    }

}
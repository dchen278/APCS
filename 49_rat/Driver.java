public class Driver {
    public static void main(String[] args) {
      Rational stillDavid = new Rational(15, 16);
      Rational jaylen = new Rational(10,16);
      Rational orion = new Rational(7,8);
      Integer i = 34;
      System.out.println(stillDavid.compareTo(jaylen)); //should return 0;
      System.out.println(jaylen.compareTo(orion));
      System.out.println(orion.compareTo(stillDavid));
      // System.out.println(stillDavid.compareTo(i));

      System.out.println("Testing .equals \n");
      Rational timmy = new Rational(2,4);
      Rational tommy = new Rational(4,8);
      Rational tammy = new Rational(5,8);
      String tim = new String("Imposter");
      System.out.println(timmy.equals(tommy)); // true
      System.out.println(tommy.equals(timmy));// true
      System.out.println(timmy.equals(tammy));// false
      System.out.println(tammy.equals(tommy)); // false
      // System.out.println(timmy.equals(tim)); // error
      System.out.println(tim.equals(tommy)); // false
      System.out.println(tim.equals(null)); // false
    }
  }
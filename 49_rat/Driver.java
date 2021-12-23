public class Driver {
    public static void main(String[] args) {
      Rational stillDavid = new Rational(5, 8);
      Rational jaylen = new Rational(10,16);
      Rational orion = new Rational(7,8);
      System.out.println(stillDavid.compareTo(jaylen)); //should return 0;
      System.out.println(jaylen.compareTo(orion));
      System.out.println(orion.compareTo(stillDavid));
    }
  }
public class Driver {
    public static void main(String[] args) {
      Rational stillDavid = new Rational(15, 16);
      Rational jaylen = new Rational(10,16);
      Rational orion = new Rational(7,8);
      Integer i = 34;
      System.out.println(stillDavid.compareTo(jaylen)); //should return 0;
      System.out.println(jaylen.compareTo(orion));
      System.out.println(orion.compareTo(stillDavid));
      System.out.println(stillDavid.compareTo(i));
    }
  }
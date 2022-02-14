public class bunnyEars {
    public static void main(String[] args) {
        System.out.println(bunnyEars(0));
        System.out.println(bunnyEars(1));
        System.out.println(bunnyEars(2));
        System.out.println(bunnyEars(3));

    }

    public static int bunnyEars(int bunnies) {
	  if (bunnies == 0) {
          return 0;
      }
	  return 2 + bunnyEars(bunnies-1);
	}
}
// Sweet Valentines : David Chen, Abdullah Faraque
// APCS pd8
// HW64: Revisitation
// 2022-02-14m
// time spent:  0.5 hrs

// We have a number of bunnies and each bunny has two big floppy ears. We want
// to compute the total number of ears across all the bunnies recursively
// (without loops or multiplication).


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
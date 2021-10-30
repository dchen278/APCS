//Return true if the string "cat" and "dog" appear the same number of times in the given string.

public class catDog {
    public static void main(String[] args) {
        catDog test = new catDog();
        System.out.println(test.catDog("catdog"));
        System.out.println(test.catDog("catcat"));
        System.out.println(test.catDog("1cat1cadodog"));
    }

    public boolean catDog(String str) {
        int cat = 0;
        int dog = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                cat++;
            }
            if (str.substring(i, i + 3).equals("dog")) {
                dog++;
            }
        }
        return cat == dog;
    }
}
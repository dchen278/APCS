public class Array {
    public static double[] powArray(double[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            a[i] = Math.pow(a[i], x);
          }
          return a;
    }

    public static int[] histogram(int[] a, int count) {
          int[] histogram = new int[count];
          for (int value : a) {
            histogram[value]++;
          }
          return histogram;
    }

    public static int indexOfMax(int[] a) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > a[result]) {
                result = i;
            }
        }
        return result;
    }

    

}

public class Mysterion {
    public static void main(String[] args) {
        System.out.println(arrToString(mysterion(new int[] {7, 1, 5, 12, 3}, 0, 4, 2)));
    }

    public static int[] mysterion(int[] arr, int a, int b, int c) {
        int v = arr[c];
        int temp = arr[c];
        arr[c] = arr[b];
        arr[b] = temp;

        int s = a;

        for (int i = a; i < b - 1; i++) {
            if (arr[i] < v) {
                temp = arr[s];
                arr[s] = arr[i];
                arr[i] = temp;
                s++;
            }
        }
        temp = arr[b];
        arr[b] = arr[s];
        arr[s] = temp;

        return arr;
    }
    public static String arrToString( int[] ary ) {
        String ans = "[";
        for( int i = 0; i < ary.length; i++ ) {
          ans += ary[i];
          if( i != ary.length - 1 ) {
            ans += ", ";
          }
        }
        return ans + "]";
      }
}

public class Lambda {

    public static boolean[] bruteForce(int n) {
        boolean[] arr = new boolean[n];

        for (int i = 1; i <= n; i++) {
            for (int j = i - 1; j < n; j += i) {
                if (arr[j]) {
                    arr[j] = false;
                } else {
                    arr[j] = true;
                }
            }
        }

        return arr;
    }

    public static boolean[] process(int n) {
        boolean[] arr = new boolean[n];

        int temp;
        for (int i = 1; i <= n; i++) {
            temp = (int) Math.sqrt((double) i);
            if (temp * temp == i) {
                arr[i - 1] = true;
            } else {
                arr[i - 1] = false;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        final int N = 100;

        boolean[] arr = process(N);

        for (int i = 0; i < N; i++) {
            if (arr[i]) {
                System.out.printf("%d\t  OPEN%n", i + 1);
            }
        }
    }
}

import java.util.Scanner;

public class Main {

    public static int process(int left, int right) {
        int n;

        int cycleLength;

        int maxCycleLength = 0;

        for (int i = left; i <= right; i++) {
            cycleLength = 0;

            n = i;

            while (true) {
                cycleLength += 1;
                if (n == 1) {
                    if (cycleLength > maxCycleLength) {
                        maxCycleLength = cycleLength;
                    }
                    break;
                }
                if ((n & 1) == 0) {
                    n >>>= 1;
                } else {
                    n = (n << 1) + n + 1;
                }
            }
        }

        return maxCycleLength;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int m;
        int n;

        while (input.hasNext()) {
            m = input.nextInt();
            n = input.nextInt();
            if (m < n) {
                System.out.printf("%d %d %d\n", m, n, process(m, n));
            } else {
                System.out.printf("%d %d %d\n", m, n, process(n, m));
            }
        }
    }
}
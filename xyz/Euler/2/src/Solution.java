import java.util.Scanner;

public class Solution {

    public static long process(long sentinel) {
        long sum = 0;

        long prev = 0;
        long curr = 2;

        long temp;
        while (curr < sentinel) {
            sum += curr;
            temp = prev + (curr << 2);
            prev = curr;
            curr = temp;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testCases;

        long sentinel;

        while (input.hasNext()) {
            testCases = input.nextInt();
            for (int i = 0; i < testCases; i++) {
                sentinel = input.nextLong();
                System.out.println(process(sentinel));
            }
        }
    }
}

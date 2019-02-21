import java.util.Scanner;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Stack<Long> s = new Stack<>();

        long n;

        while (input.hasNext()) {
            n = input.nextLong();
            s.push(n);
        }

        while (!s.empty()) {
            System.out.printf("%.4f\n", Math.sqrt((double) s.peek()));
            s.pop();
        }
    }
}

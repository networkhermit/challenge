public class Lambda {

    public static void fizzBuzz(int n) {
        boolean divisible;

        for (int i = 1; i <= n; i++) {
            divisible = false;

            if (i % 3 == 0) {
                System.out.print("Fizz");
                divisible = true;
            }
            if (i % 5 == 0) {
                System.out.print("Buzz");
                divisible = true;
            }
            if (!divisible) {
                System.out.print(i);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        fizzBuzz(100);
    }
}

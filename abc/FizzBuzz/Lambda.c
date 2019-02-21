#include <stdbool.h>
#include <stdio.h>

void fizzBuzz(int n) {
    bool divisible;

    for (int i = 1; i <= n; i++) {
        divisible = false;

        if (i % 3 == 0) {
            printf("%s", "Fizz");
            divisible = true;
        }
        if (i % 5 == 0) {
            printf("%s", "Buzz");
            divisible = true;
        }
        if (!divisible) {
            printf("%d", i);
        }

        putchar('\n');
    }
}

int main(void) {
    fizzBuzz(100);
}

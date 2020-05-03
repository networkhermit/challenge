#include <limits.h>
#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

const char *fizzBuzz(int n) {
    const int MAX_DIGIT = (int) log10(INT_MAX) + 1;
    const int MAX_ALPHA = strlen("FizzBuzz");
    const int MAX_LENGTH = MAX_DIGIT > MAX_ALPHA ? MAX_DIGIT : MAX_ALPHA;

    char *word = (char *) calloc(MAX_LENGTH, sizeof(char));

    if (n % 3 == 0) {
        strcat(word, "Fizz");
    }
    if (n % 5 == 0) {
        strcat(word, "Buzz");
    }

    if (word[0] == '\0') {
        sprintf(word, "%d", n);
    }

    return word;
}

int main(void) {
    for (int i = 1; i <= 100; i++) {
        printf("%s\n", fizzBuzz(i));
    }
}

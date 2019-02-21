#include <iostream>

using namespace std;

void fizzBuzz(int n) {
    bool divisible;

    for (int i = 1; i <= n; i++) {
        divisible = false;

        if (i % 3 == 0) {
            cout << "Fizz";
            divisible = true;
        }
        if (i % 5 == 0) {
            cout << "Buzz";
            divisible = true;
        }
        if (!divisible) {
            cout << i;
        }

        cout << endl;
    }
}

int main() {
    fizzBuzz(100);
}

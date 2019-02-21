<?php
    function fizzBuzz(int $n): void {
        $divisible = false;

        for ($i = 1; $i <= $n; $i++) {
            $divisible = false;

            if ($i % 3 == 0) {
                print("Fizz");
                $divisible = true;
            }
            if ($i % 5 == 0) {
                print("Buzz");
                $divisible = true;
            }
            if (!$divisible) {
                print($i);
            }

            print("\n");
        }
    }

    if (count(debug_backtrace()) == 0) {
        fizzBuzz(100);
    }
?>

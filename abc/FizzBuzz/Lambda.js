"use strict"

const fizzBuzz = (n) => {
    let divisible = false

    for (let i = 1; i <= n; i++) {
        divisible = false

        if (i % 3 === 0) {
            process.stdout.write("Fizz")
            divisible = true
        }
        if (i % 5 === 0) {
            process.stdout.write("Buzz")
            divisible = true
        }
        if (!divisible) {
            process.stdout.write(String(i))
        }

        console.log()
    }
}

if (module === require.main) {
    fizzBuzz(100)
}

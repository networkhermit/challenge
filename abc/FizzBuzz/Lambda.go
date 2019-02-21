package main

import "fmt"

func fizzBuzz(n int) {
    var divisible bool

    for i := 1; i <= n; i++ {
        divisible = false

        if i % 3 == 0 {
            fmt.Print("Fizz")
            divisible = true
        }
        if i % 5 == 0 {
            fmt.Print("Buzz")
            divisible = true
        }
        if !divisible {
            fmt.Print(i)
        }

        fmt.Println()
    }
}

func main() {
    fizzBuzz(100)
}

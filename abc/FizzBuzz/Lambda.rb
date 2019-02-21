def fizzBuzz(n)
    divisible = false

    for i in 1 .. n
        divisible = false

        if i % 3 == 0
            print("Fizz")
            divisible = true
        end
        if i % 5 == 0
            print("Buzz")
            divisible = true
        end
        if !divisible
            print(i)
        end

        puts()
    end
end

if __FILE__ == $0
    fizzBuzz(100)
end

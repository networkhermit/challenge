def fizzBuzz(n)
    word = ""

    if n % 3 == 0
        word += "Fizz"
    end
    if n % 5 == 0
        word += "Buzz"
    end

    if word.length == 0
        word = n.to_s()
    end

    return word
end

if __FILE__ == $0
    for i in 1 .. 100
        puts(fizzBuzz(i))
    end
end

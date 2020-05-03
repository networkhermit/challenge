def fizzBuzz(n: int) -> str:
    word = ""

    if n % 3 == 0:
        word += "Fizz"
    if n % 5 == 0:
        word += "Buzz"

    if len(word) == 0:
        word = str(n)

    return word

if __name__ == "__main__":
    for i in range(1, 101):
        print(fizzBuzz(i))

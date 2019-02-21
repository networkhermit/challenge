def fizzBuzz(n: int) -> None:
    divisible = False

    for i in range(1, n + 1):
        divisible = False

        if i % 3 == 0:
            print("Fizz", end = '')
            divisible = True
        if i % 5 == 0:
            print("Buzz", end = '')
            divisible = True
        if not divisible:
            print(i, end = '')

        print()

if __name__ == "__main__":
    fizzBuzz(100)

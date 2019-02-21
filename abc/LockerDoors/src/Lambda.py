import math

def bruteForce(n: int) -> list:
    arr = [False] * n

    for i in range(1, n + 1):
        for j in range(i - 1, n, i):
            if arr[j]:
                arr[j] = False
            else:
                arr[j] = True

    return arr

def process(n: int) -> list:
    arr = [False] * n

    temp = 0
    for i in range(1, n + 1):
        temp = int(math.sqrt(float(i)))
        if temp * temp == i:
            arr[i - 1] = True
        else:
            arr[i - 1] = False

    return arr

if __name__ == "__main__":
    N = 100

    arr = process(N)

    for i, v in enumerate(arr):
        if v:
            print("%d\t  OPEN" % (i + 1))

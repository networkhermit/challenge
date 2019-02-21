"use strict"

const bruteForce = (n) => {
    const arr = new Array(n)

    arr.fill(false)

    for (let i = 1; i <= n; i++) {
        for (let j = i - 1; j < n; j += i) {
            if (arr[j]) {
                arr[j] = false
            } else {
                arr[j] = true
            }
        }
    }

    return arr
}

const process = (n) => {
    const arr = Array(n)

    let temp = 0
    for (let i = 1; i <= n; i++) {
        temp = Math.floor(Math.sqrt(i))
        if (temp * temp === i) {
            arr[i - 1] = true
        } else {
            arr[i - 1] = false
        }
    }

    return arr
}

if (module === require.main) {
    const N = 100

    const arr = process(N)

    for (let i = 0; i < N; i++) {
        if (arr[i]) {
            console.log("%d\t  OPEN", i + 1)
        }
    }
}

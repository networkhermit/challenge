def bruteForce(n)
    arr = Array.new(n, false)

    for i in 1 ... n + 1
        j = i - 1
        while j < n
            arr[j] = !arr[j]
            j += i
        end
    end

    return arr
end

def process(n)
    arr = Array.new(n)

    temp = 0
    for i in 1 ... n + 1
        temp = Math.sqrt(i.to_f()).to_i()
        arr[i - 1] = temp * temp == i
    end

    return arr
end

if __FILE__ == $0
    N = 100

    arr = process(N)

    arr.each_index do |i|
        if arr[i]
            puts("%d\t  OPEN" % (i + 1))
        end
    end
end

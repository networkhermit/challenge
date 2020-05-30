def bruteForce(n)
    arr = Array.new(n, false)

    (1 ... n + 1).each do |i|
        j = i - 1
        while j < n
            arr[j] = !arr[j]
            j += i
        end
    end

    arr
end

def process(n)
    arr = Array.new(n)

    temp = 0
    (1 ... n + 1).each do |i|
        temp = Math.sqrt(i.to_f()).to_i()
        arr[i - 1] = temp * temp == i
    end

    arr
end

if __FILE__ == $PROGRAM_NAME
    N = 100

    arr = process(N)

    arr.each_index do |i|
        if arr[i]
            puts(format("%d\t  OPEN", i + 1))
        end
    end
end

<?php
    function bruteForce(int $n): array {
        $arr = array_pad(array(), $n, false);

        for ($i = 1; $i <= $n; $i++) {
            for ($j = $i - 1; $j < $n; $j += $i) {
                if ($arr[$j]) {
                    $arr[$j] = false;
                } else {
                    $arr[$j] = true;
                }
            }
        }

        return $arr;
    }

    function process(int $n): array {
        $arr = array_pad(array(), $n, false);

        $temp = 0;
        for ($i = 1; $i <= $n; $i++) {
            $temp = (int) sqrt((float) $i);
            if ($temp * $temp == $i) {
                $arr[$i - 1] = true;
            } else {
                $arr[$i - 1] = false;
            }
        }

        return $arr;
    }

    if (count(debug_backtrace()) == 0) {
        $N = 100;

        $arr = process($N);

        foreach ($arr as $i => $v) {
            if ($v) {
                printf("%d\t  OPEN\n", $i + 1);
            }
        }
    }
?>

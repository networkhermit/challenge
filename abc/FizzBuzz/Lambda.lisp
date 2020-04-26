(defun fizz-buzz (n)
  (do (divisible

       (i 1 (1+ i)))
    ((> i n))
    (setf divisible nil)

    (when (zerop (rem i 3))
      (write-string "Fizz")
      (setf divisible t))
    (when (zerop (rem i 5))
      (write-string "Buzz")
      (setf divisible t))
    (when (not divisible)
      (write i))

    (terpri)))

(defun main ()
  (fizz-buzz 100))

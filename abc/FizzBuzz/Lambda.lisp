(defun fizz-buzz (n)
  (let ((divisible nil))

    (do ((i 1 (incf i)))
      ((> i n))
      (setf divisible nil)

      (when (= (rem i 3) 0)
        (write-string "Fizz")
        (setf divisible t))
      (when (= (rem i 5) 0)
        (write-string "Buzz")
        (setf divisible t))
      (when (not divisible)
        (write i))

      (terpri))))

(defun main ()
  (fizz-buzz 100))

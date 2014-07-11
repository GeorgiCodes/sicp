;;;;;;;;;;;;;;;;;
;Exercise 1.3.
;Define a procedure that takes three numbers as arguments and
;returns the sum of the squares of the two larger numbers.

(defn square
  [x]
  (* x x))

(defn sum-of-squares-of-largest
  [a b c]
  (let [sorted (sort [a b c])
        largest (nth sorted 2)
        second-largest (nth sorted 1)]
  (+ (square largest) (square second-largest))))


(sum-of-squares-of-largest 10 2 1)


; David Rose -- J00524659
; Homework-9 -- CSC 333

; This program has two functions
; 1. Find the sum of a list of ints
; 2. Check if two list are equal

(ns hw.core
  (:gen-class))

(defn cntSeq [lst]
  (if (empty? lst)
    nil
    (apply + lst)))


(defn eqlList [x y]
  (if (= x y) "true" "false")
  )

(defn -main []
  (println (cntSeq '(1 2 3 4 5)))
  (println (cntSeq '(1)))
  (println (cntSeq '()))
  
  (println (eqlList '(1 2 3) '(1 2 3)))
  (println (eqlList '(2 1 3) '(2 1 4)))
  (println (eqlList '(1 2 3) '(1 2)))
  (println (eqlList '() '(1 23))))


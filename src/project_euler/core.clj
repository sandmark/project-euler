(ns project-euler.core)

(defn problem-1
  "10未満の自然数のうち, 3 もしくは 5 の倍数になっているものは 3, 5, 6, 9 の4つがあり,
  これらの合計は 23 になる.

  同じようにして, 1000 未満の 3 か 5 の倍数になっている数字の合計を求めよ."
  [n]
  (letfn [(multi? [x] (or (zero? (mod x 3))
                          (zero? (mod x 5))))]
    (->> n
         range
         (filter multi?)
         (reduce +))))

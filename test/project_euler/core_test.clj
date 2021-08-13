(ns project-euler.core-test
  (:require [project-euler.core :as sut]
            [clojure.test :as t]))

(t/deftest basic-problem-tests
  (t/testing "problem-1"
    (t/testing "returns 23 if n = 10"
      (t/is (= (sut/problem-1 10) 23)))))

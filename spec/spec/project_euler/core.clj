(ns spec.project-euler.core
  (:require [clojure.spec.alpha :as s]))

(s/fdef project-euler.core/problem-1
  :args (s/cat :n pos-int?)
  :ret pos-int?)

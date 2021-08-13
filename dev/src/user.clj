(ns user
  (:require [clojure.spec.test.alpha :as stest]
            [clojure.tools.namespace.repl :as trepl :refer [refresh]]))

(trepl/set-refresh-dirs "dev/src" "src" "test" "spec")

(stest/instrument)

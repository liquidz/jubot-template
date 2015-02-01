(ns {{name}}.core-test
  (:require
    [jubot.adapter.test :refer :all]
    [clojure.test :refer :all]
    [{{name}}.core :refer :all]))

(def ^:private adapter (->TestAdapter "bot"))

(deftest test-handler
  (are [x y] (= x (handler adapter y))
    "pong"            "ping"
    "unknown command" "xxxx"))


(ns {{name}}.sample.pingpong-test
  (:require
    [{{name}}.sample.pingpong :refer :all]
    [clojure.test :refer :all]))

(deftest test-ping-handler
  (are [x y] (= x (ping-handler (merge {:message-for-me? true} y)))
    nil    {}
    "pong" {:text "ping"}))

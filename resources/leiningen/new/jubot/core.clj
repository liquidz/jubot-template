(ns {{name}}.core
  (:require
    [jubot.core :refer [jubot]]))

(def ns-prefix #"^{{name}}\.")

(def -main (jubot :ns-regexp ns-prefix))

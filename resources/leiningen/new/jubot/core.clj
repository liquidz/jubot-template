(ns {{name}}.core
  (:require
    [jubot.core :refer :all]
    [jubot.adapter :refer :all]
    [jubot.brain :as jb]
    [jubot.schedule :as js]
    [jubot.util.handler :as jh]))

(def handler
  (jh/regexp-handler
    #"^ping$"            (constantly "pong")
    #"^set (.+?) (.+?)$" (fn [this [[_ k v]]] (jb/set k v))
    #"^get (.+?)$"       (fn [this [[_ k]]]   (jb/get k))
    :else                (constantly "unknown command")))

(js/set-schedule!
  "0 * * * * * *"
  (fn [this] (send! this "every minutes")))

(def -main (jubot handler))

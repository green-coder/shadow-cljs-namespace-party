(ns a.core
  (:require [a.b :as b]
            [a.b.c :as c]))

(defn init []
  (js/console.log b/c c/d))

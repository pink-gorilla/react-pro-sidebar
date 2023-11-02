(ns clock.core
  (:require
   [clojure.string :as str]
   ["react" :as react]))

;; Same as simpleexample, but uses Hooks instead of Ratoms


(defn clock [time-color]
  (let [[timer update-time] (react/useState (js/Date.))
        time-str (-> timer .toTimeString (str/split " ") first)]
    (react/useEffect
     (fn []
       (let [i (js/setInterval #(update-time (js/Date.)) 1000)]
         (fn []
           (js/clearInterval i)))))
    [:div.example-clock
     {:style {:color time-color}}
     time-str]))
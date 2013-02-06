(ns hadoop1.core
 (:require [clojure-hadoop.wrap :as wrap]
            [clojure-hadoop.defjob :as defjob])
  (:import (java.util StringTokenizer))
  (:use clojure-hadoop.job))

(defn my-map [key value]
  (map (fn [token] [token 1])
       (enumeration-seq (StringTokenizer. value))))

(defn my-reduce [key values-fn]
  [[key (reduce + (values-fn))]])

(defjob/defjob job
  :map my-map
  :map-reader wrap/int-string-map-reader
  :reduce my-reduce
  :input-format :text
  :input "README.txt"
  :output "tmp/out4"
  :replace true)

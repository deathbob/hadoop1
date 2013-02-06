(defproject hadoop1 "1.0.1"
  :description "Hadoop 1"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [clojure-hadoop "1.4.1"]])

;; do 'lein uberjar' to compile
;; then the below to run it
;; java -cp hadoop1-1.0.1-standalone.jar clojure_hadoop.job -job hadoop1.core/job

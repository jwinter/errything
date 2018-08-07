(ns alephsystem.core
  (:gen-class)
  (:require 
   [system.repl :refer [set-init! start]]
   [alephsystem.systems :refer [prod-system]]))

(defn -main
  "Start a production system."
  [& args]
  (set-init! #'prod-system)
  (start))

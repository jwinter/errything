(ns user
  (:require 
   [system.repl :refer [system set-init! start stop reset]]
   [alephsystem.systems :refer [dev-system]]))

(set-init! #'dev-system)

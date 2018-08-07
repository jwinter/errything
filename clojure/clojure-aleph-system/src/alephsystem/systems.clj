(ns alephsystem.systems
  (:require [system.core :refer [defsystem]]
            (system.components 
             [aleph :refer [new-web-server]]
             [repl-server :refer [new-repl-server]])
            [environ.core :refer [env]]
            [alephsystem.handler :refer [app]]))

(defsystem dev-system
  [:web (new-web-server (Integer. 3000) app)])

(defsystem prod-system
  [:web (new-web-server (Integer. 8080) app)
   :repl-server (new-repl-server (Integer. 8001))])

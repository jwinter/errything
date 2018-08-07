(ns alephsystem.handler
  (:require
    [compojure.core :as compojure :refer [GET]]
    [ring.middleware.params :as params]
    [cheshire.core :as json]
    [compojure.route :as route]))

(defn alive [req]
  {:status 200
    :headers {"Content-Type" "application/json"}
    :body (json/encode {:alive true})})

(def app
  (params/wrap-params
   (compojure/routes
    (GET "/alive" [] alive)
    (route/not-found "No such page."))))

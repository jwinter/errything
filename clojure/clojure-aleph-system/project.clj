(defproject aleph-system "0.1.0-SNAPSHOT"
  :description "TODO"
  :url "TODO"
  :main alephsystem.core
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.danielsz/system "0.4.1"]
                 [aleph "0.4.7-alpha1"]
                 [compojure "1.6.1"]
                 [cheshire "5.8.0"]
                 [environ "1.0.0"]
                 [org.clojure/tools.nrepl "0.2.12"]]
  :profiles {:dev {:source-paths ["dev"]
                   :env {:http-port 3000}}
             :prod {:env {:http-port 8000
                          :repl-port 8001}
                    :dependencies [[org.clojure/tools.nrepl "0.2.12"]]}
             :uberjar {:aot :all}})

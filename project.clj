(defproject api "0.1.0-SNAPSHOT"
  :description "A POC api for ULE data"
  :url "http://example.com/FIXME"
  :license {:name "license here"
            :url "http://localhost/void.txt"}

  :dependencies [[org.clojure/clojure "1.5.1"]
                 [ring/ring-json "0.2.0"]
                 [http-kit "2.0.0"]
                 [ring/ring-devel "1.1.8"]
                 [compojure "1.1.5"]
                 [ring-cors "0.1.0"]
                 [liberator "0.10.0"]
                 [sqljdbc4/sqljdbc4 "4.0"]
                 [http-kit "2.1.4"]
                 [korma "0.3.0-RC5"]
                 [com.taoensso/timbre "3.0.0-RC2"]
                 [com.datomic/datomic-pro "0.9.4360"]]

  :repositories {"local" ~(str (.toURI (java.io.File. "local-repo")))}
  :jvm-opts ["-Xmx4g"]
  :main api.core)

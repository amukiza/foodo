(defproject foodo "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.1.6"]
                 [ring-server "0.3.1"]]

  :plugins [[lein-ring "0.8.10"]
            [lein-midje "3.1.3"]]
  :ring {:handler foodo.handler/app
         :init foodo.handler/init
         :destroy foodo.handler/destroy}
  :aot :all
  :profiles
  {:production
   {:ring
    {:open-browser? false, :stacktraces? false, :auto-reload? false}}
   :dev
   {:dependencies [[ring-mock "0.1.5"]
                   [ring/ring-devel "1.2.1"]
                   [midje "1.6.3"]]}})

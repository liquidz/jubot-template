(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [jubot "0.0.1-SNAPSHOT"]]
  :uberjar-name "{{sanitized}}-standalone.jar"
  :min-lein-version "2.0.0"
  :main {{name}}.core)

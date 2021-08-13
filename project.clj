(defproject project-euler "0.1.0-SNAPSHOT"
  :description "Project Euler challenge in Clojure"
  :url "https://github.com/sandmark/project-euler"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url  "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.3"]]
  :profiles
  {:repl {:repl-options {:init-ns user}}
   :dev  {:source-paths   ["dev/src" "spec"]
          :resource-paths ["dev/resources"]}})

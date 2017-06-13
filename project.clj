(defproject clojusc/ltest "0.1.0-SNAPSHOT"
  :description "A custom test runner for clojure.test with detailed, coloured output and summaries"
  :url "https://github.com/clojusc/ltest"
  :license {
    :name "Apache License, Version 2.0"
    :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :exclusions [
    [org.clojure/clojure]]
  :dependencies [
    [clansi "1.0.0"]
    [io.aviso/pretty "0.1.33"]
    [org.clojure/clojure "1.8.0"]
    [potemkin "0.4.3"]]
  :profiles {
    :dev {
      :dependencies [
        [org.clojure/tools.namespace "0.2.11"]]
      :plugins [
        [jonase/eastwood "0.2.3"]
        [lein-ancient "0.6.10"]
        [lein-bikeshed "0.4.1"]
        [lein-kibit "0.1.5"]
        [lein-shell "0.5.0"]
        [venantius/yagni "0.1.4"]]
      :source-paths [
        "dev-resources/src"
        "resources/sample-tests/src"]
      :repl-options {
        :init-ns ltest.dev}}}
  :aliases {
    "check-deps" ["ancient" "check" ":all"]
    "kibit" ["do" ["shell" "echo" "== Kibit =="]
                  ["kibit"]]
    "outlaw" ["eastwood" "{:namespaces [:source-paths]}"]
    "lint" ["do" ["check"] ["kibit"] ["outlaw"]]})

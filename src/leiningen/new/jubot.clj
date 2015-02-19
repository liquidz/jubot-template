(ns leiningen.new.jubot
  (:require
    [leiningen.new.templates :refer [renderer name-to-path ->files]]
    [leiningen.core.main     :as main]))

(def render (renderer "jubot"))

(defn jubot
  "FIXME: write documentation"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' jubot project.")
    (->files
      data
      [".gitignore"   (render ".gitignore" data)]
      ["LICENSE"      (render "LICENSE" data)]
      ["README.md"    (render "README.md" data)]
      ["Procfile"     (render "Procfile" data)]
      ["project.clj"  (render "project.clj" data)]
      ["dev/user.clj" (render "user.clj" data)]
      ["src/{{sanitized}}/core.clj"         (render "core.clj" data)]
      ["src/{{sanitized}}/sample.clj"       (render "sample.clj" data)]
      ["test/{{sanitized}}/sample_test.clj" (render "sample_test.clj" data)]
      )))

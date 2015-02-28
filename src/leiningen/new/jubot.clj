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
      ["src/{{sanitized}}/core.clj"                  (render "core.clj" data)]
      ["src/{{sanitized}}/edit_me.clj"               (render "edit_me.clj" data)]
      ["src/{{sanitized}}/sample/pingpong.clj"       (render "pingpong.clj" data)]
      ["src/{{sanitized}}/sample/brain.clj"          (render "brain.clj" data)]
      ["test/{{sanitized}}/edit_me_test.clj"         (render "edit_me_test.clj" data)]
      ["test/{{sanitized}}/sample/pingpong_test.clj" (render "pingpong_test.clj" data)]
      ["test/{{sanitized}}/sample/brain_test.clj"    (render "brain_test.clj" data)]
      )))

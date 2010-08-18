(use 'clojure.contrib.shell-out)

(defn tom []
  (future
    (Thread/sleep 500)
    (future (sh "afplay" "tom.wav"))
    (tom)))

(defn snare []
  (future
    (Thread/sleep 700)
    (future (sh "afplay" "snare.wav"))
    (snare)))

(tom)
(snare)

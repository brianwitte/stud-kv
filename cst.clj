#!/usr/bin/env bb

;; install babashka 
;; bash < <(curl -s https://raw.githubusercontent.com/babashka/babashka/master/install)

;; this script inspired by https://github.com/babashka/babashka/blob/master/examples/pst.clj

;; ༼つಠ益ಠ༽つ ─=≡ΣO)) HADOUKEN

(def now (java.time.ZonedDateTime/now))
(def ATX-timezone (java.time.ZoneId/of "America/Chicago"))
(def ATX-time (.withZoneSameInstant now ATX-timezone))
(def pattern (java.time.format.DateTimeFormatter/ofPattern "HH:mm"))
(println (.format ATX-time pattern))

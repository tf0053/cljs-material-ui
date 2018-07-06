(ns cljs-material-ui.chip-input.rum
  (:require [cljsjs.material-ui-chip-input])
  (:require-macros [cljs-material-ui.core]))

(def chip-input (cljs-material-ui.core/adapt-rum-class (aget js/window "MaterialUIChipInput")))

(ns cljs-material-ui.chip-input.reagent
  (:require [cljsjs.material-ui-chip-input]
            [reagent.core :as r]))

(def chip-input (r/adapt-react-class (aget js/window "MaterialUIChipInput")))

(ns kanban.core
  (:require [reagent.core :as reagent :refer [atom]]))

(enable-console-print!)

(defonce app-state (atom {:text "Hello Kanban!"}))

(defn Card []
  [:div.card])

(defn Column []
  [:div.column])

(defn Board []
  [:div.board])

(reagent/render [Board] (js/document.getElementById "app"))

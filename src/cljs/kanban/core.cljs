(ns kanban.core
  (:require [reagent.core :as reagent :refer [atom]]))

(enable-console-print!)

(defonce app-state (atom {:text "Hello Kanban!"}))

(defn Card []
  [:div.card
   "a card"])

(defn NewCard []
  [:div.new-card
   "+ add new card"])

(defn Column []
  [:div.column
   [:h2 "a column"]
   [Card]
   [Card]
   [Card]
   [NewCard]])

(defn NewColumn []
  [:div.new-column
   "+ add new column"])

(defn Board []
  [:div.board
   [Column]
   [Column]
   [NewColumn]])

(reagent/render [Board] (js/document.getElementById "app"))

(ns phlegm.views
  (:require
   [re-frame.core :as re-frame]
   [phlegm.subs :as subs]
   ))

(defn main-panel []
   [:div
     [:h1 "The One True API"]
     [:p "It's called that right now because this is for testing and multiple APIs haven't been implemented yet. No one knows yet what this example API will be fake capable of."]
     [:button "New"]
     [:div
       [:span "POST "]
       [:span "/entrant "]
       [:span "enters a user into a race"]
     ]
   ])

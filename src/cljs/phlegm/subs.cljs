(ns phlegm.subs
  (:require
   [re-frame.core :as re-frame]))

(re-frame/reg-sub
 ::name
 (fn [db _]
   (:name db)))

(re-frame/reg-sub
 ::goink
 (fn [db _]
   (:blarb db)))


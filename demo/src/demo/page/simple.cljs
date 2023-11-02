(ns demo.page.simple
  (:require
   [reagent.core :as r]
   [clock.core :refer [clock]]
   [react-pro-sidebar.core :as sb]))





#_(defn sidebar-simple []
    [sidebar
     [menu
      [menu-item "Alerts"]
      [sub-menu {:label "Charts"}
       [menu-item "PieCharts"]
       [menu-item "PieCharts"]]
      [menu-item "Documentation"]
      [menu-item "Github"]]])


(defn sidebar-flo []
   [:r> sb/sidebar2
   #js {:image "https://user-images.githubusercontent.com/25878302/144499035-2911184c-76d3-4611-86e7-bc4e8ff84ff5.jpg"}
   [:r> sb/menu2 #js {}
    ;[:r> sb/menu-item2 #js {} "Alerts"]
      ;   [:> sb/menu-item2 "Dracula"]
      ;   [:> sb/menu-item2 "BillaBongo"]
    ]]
  )


(def x 
  (r/create-element sb/sidebar2  #js {:image "https://user-images.githubusercontent.com/25878302/144499035-2911184c-76d3-4611-86e7-bc4e8ff84ff5.jpg"}
                    #_(r/create-element sb/menu2 #js {}
                                        (r/create-element sb/menu-item2 #js {} "Alerts")
                                        (r/create-element sb/menu-item2 #js {} "Willy")))
  
  )


(defn page-simple [_]
    (fn []
  [:div.w-screen.h-screen.bg-red-100
  ; [:f> clock "#f34"]
   #_[sidebar-simple]
    ;[:f> sidebar-flo]
   ; 

   [:f> sidebar-flo]
   ;x

   #_[:r> sb/sidebar2
      [:r> sb/menu2]]
   
   #_[sb/sidebar3
      [sb/menu3
       [sb/menu-item3 "Hello"]
       [sb/menu-item3 "World"]]]

   #_[:r> sb/sidebar2
      [sb/menu2
       [sb/menu-item3 "Hello"]
       [sb/menu-item3 "World"]]]


   ;[(sb/create-forwarded-element sb/sidebar2)]
   
]))


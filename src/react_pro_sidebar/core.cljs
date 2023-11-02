(ns react-pro-sidebar.core
  (:require
    ["react" :as react]
    [reagent.core :as r]
    ["react-pro-sidebar" :as rps :refer [Sidebar Menu SubMenu MenuItem]]))

(def ^:private create-element react/createElement)
(def ^:private forward-ref react/forwardRef)

(defn create-forwarded-element
   "Create React component wrapped with React.forwardRef"
   [component]
   (let [component-wrapper
         #(create-element
           component
           nil)]
     (forward-ref component-wrapper)))

#_(defn sidebar [& c]
  (into [:f> Sidebar] c))

(def sidebar2 Sidebar )
(def menu2 Menu)
(def sub-menu2 SubMenu)
(def menu-item2 MenuItem)

(def sidebar3 (r/adapt-react-class Sidebar))
(def menu3 (r/adapt-react-class Menu))
(def menu-item3 (r/adapt-react-class MenuItem))
(def sub-menu3 (r/adapt-react-class SubMenu))

; Calling r/create-element directly with a ClojureScript function doesn't wrap the 
; component in any Reagent wrappers, and will create functional components. 
; In this case you need to use r/as-element inside the function to convert 
; Hiccup-style markup to elements, or just return React Elements yourself. 
; You also can't use Ratoms here, as Ratom implementation requires that the 
; component is wrapped by Reagent.

; :r> shortcut can be used to create components similar to r/create-element, 
; and the children Hiccup forms are converted to React element automatically.

; Using adapt-react-class or :> is also calls create-element, but that also does automatic 
; conversion of ClojureScript parameters to JS objects, which isn't usually desired 
; if the component is ClojureScript function.

; :f> shortcut can be used to create function components from Reagent components (functions)
; , where both RAtoms and Hooks work


;(def sidebar3 (r/create-element Sidebar))
 


(defn sidebar []
  [:r> Sidebar])

(defn menu [& c]
  (into [:f> Menu] c))

(defn menu-item [& c]
  (into [:f> MenuItem ] c))

(defn sub-menu [& c]
  (into [:f> SubMenu] c))
 
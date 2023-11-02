# react-pro-sidebar [![GitHub Actions status |pink-gorilla/react-pro-sidebar](https://github.com/pink-gorilla/react-pro-sidebar/workflows/CI/badge.svg)](https://github.com/pink-gorilla/react-pro-sidebar/actions?workflow=CI)[![Clojars Project](https://img.shields.io/clojars/v/org.pinkgorilla/react-pro-sidebar.svg)](https://clojars.org/org.pinkgorilla/react-pro-sidebar)

#
- based on: [react-pro-sidebar](https://github.com/Frozenlock/react-pro-sidebar)


# example

```
 [rtable {:class "table-head-fixed padding-sm table-red table-striped table-hover"
          :style {:width "50vw"
                  :height "40vh"
                  :border "3px solid green"}}
    [{:path :id}
     {:path :name :max-width "60px"}
     {:path :quote}
     {:path :quote2}]
    data]
```

# demo

The demo uses the extension manager from goldly to add react-pro-sidebar to goldly.

```
cd demo
clj -X:demo:npm-install
clj -X:demo:compile
clj -X:demo
```

Open Browser at port 8080.
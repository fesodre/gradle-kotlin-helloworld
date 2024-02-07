include("subproject")
include("subproject:subsubproject")

rootProject.name = "foo"

project(":subproject").name = "bar"
project(":subproject:subsubproject").name = "barbar"

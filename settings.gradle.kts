include("subproject")
include("subproject:subsubproject")
includeBuild("other_project")

rootProject.name = "foo"

project(":subproject").name = "bar"
project(":subproject:subsubproject").name = "barbar"

plugins {
    base
    alias(libs.plugins.fleet.plugin)
}

version = "0.1.0"

fleetPlugin {
    id = "fi.sulku.fleet.githubinspired"

     metadata {
         readableName = "Github Inspired - Dark"
         description = "Github color theme inspired. Feel free to contribute!\n" +
                       "If \"Add\" plugin doesn't work you can copy the theme to <home>/.fleet/themes/ " +
                       "You can Also find the project on github \"Github-Inspired-Fleet-Theme\" by Zoltus"
     }

    fleetRuntime {
        version = libs.versions.fleet.runtime
    }
}

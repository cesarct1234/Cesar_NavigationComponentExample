pluginManagement {
buildscript{

}
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
    }
}
       mavenCentral()
       gradlePluginPortal()
   }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        google()


    }
}

rootProject.name = "NavigationComponentExample"
include(":app")
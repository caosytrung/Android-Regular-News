pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
rootProject.name = "AndroidRegularNews"
include(":app")
include(":core:data")
include(":core:common")
include(":core:model")
include(":core:database")
include(":core:datastore")
include(":core:datastore-proto")
include(":core:main")
include(":core:ui")
include(":core:network")
include(":core:domain")
include(":core:designsystem")

include(":features:foryou")
include(":features:interests")
include(":features:bookmarks")
include(":features:search")
include(":features:topic")
include(":features:setting")

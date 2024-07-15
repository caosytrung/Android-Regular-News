package com.google.samples.apps.nowinandroid

enum class AppBuildType(val applicationIdSuffix: String? = null) {
    DEBUG(".debug"),
    RELEASE(".release"),
}

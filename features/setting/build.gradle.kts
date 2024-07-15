plugins {
    alias(libs.plugins.newssample.android.feature)
    alias(libs.plugins.newssample.android.library.compose)
}

android {
    namespace = "com.example.setting"
}

dependencies {
    implementation(libs.accompanist.permissions)
    implementation(projects.core.data)
    implementation(projects.core.domain)

    testImplementation(libs.hilt.android.testing)
}
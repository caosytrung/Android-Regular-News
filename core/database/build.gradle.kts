plugins {
    alias(libs.plugins.newssample.android.library)
    alias(libs.plugins.newssample.android.hilt)
    alias(libs.plugins.newssample.android.room)
}

android {
    namespace = "com.example.androidregularnews.core.database"
    testOptions {
        unitTests {
            isIncludeAndroidResources = true
            isReturnDefaultValues = true
        }
    }
}

dependencies {
    api(projects.core.model)

    implementation(libs.kotlinx.datetime)

    androidTestImplementation(libs.androidx.test.core)
    androidTestImplementation(libs.androidx.test.runner)
    androidTestImplementation(libs.kotlinx.coroutines.test)
}

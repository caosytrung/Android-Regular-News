plugins {
    alias(libs.plugins.newssample.android.library)
}

android {
    namespace = "com.example.model"
    testOptions {
        unitTests {
            isIncludeAndroidResources = true
            isReturnDefaultValues = true
        }
    }
}

dependencies {
    api(libs.kotlinx.datetime)
}

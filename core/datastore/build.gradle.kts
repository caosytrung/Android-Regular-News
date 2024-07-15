plugins {
    alias(libs.plugins.newssample.android.library)
    alias(libs.plugins.newssample.android.hilt)
    id("kotlinx-serialization")
}



android {
    namespace = "com.example.datastore"
    testOptions {
        unitTests {
            isIncludeAndroidResources = true
            isReturnDefaultValues = true
        }
    }
}

dependencies {
    api(libs.androidx.dataStore.core)
    api(projects.core.datastoreProto)
    api(projects.core.model)

    implementation(projects.core.common)
}

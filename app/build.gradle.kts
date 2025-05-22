plugins {
    kotlin("android") version libs.versions.kotlin
    id("com.android.library") version "8.10.0"
    id("com.alsutton.kt77739")
}

android {
    namespace = "com.alsutton.kt77739"
    compileSdk = 35

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }
}
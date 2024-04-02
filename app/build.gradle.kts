plugins {
    //alias(libs.plugins.androidApplication)
    id("com.android.application")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.gustavo.projetofirebase"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.gustavo.projetofirebase"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}



dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    implementation(platform("com.google.firebase:firebase-bom:32.8.0"))
    implementation(platform("com.google.firebase:firebase-auth"))
    implementation (platform("com.google.firebase:firebase-firestore"))
}
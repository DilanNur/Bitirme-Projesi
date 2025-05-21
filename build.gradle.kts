plugins {
    id 'com.android.application'
    id 'org.jetbrains.kotlin.android'
    id 'kotlin-kapt'
}

android {
    buildFeatures {
        viewBinding true
    }
}

dependencies {

    implementation 'androidx.core:core-ktx:1.7.0'
    implementation 'androidx.appcompat:appcompat:1.4.1'


    implementation 'androidx.lifecycle:lifecycle-viewmodel-ktx:2.4.1'
    implementation 'androidx.lifecycle:lifecycle-livedata-ktx:2.4.1'


    implementation 'com.squareup.retrofit2:retrofit:2.9.0'
    implementation 'com.squareup.retrofit2:converter-gson:2.9.0'

    implementation 'com.github.bumptech.glide:glide:4.13.0'
    kapt 'com.github.bumptech.glide:compiler:4.13.0'


    implementation 'androidx.recyclerview:recyclerview:1.2.1'


    implementation 'com.google.android.material:material:1.5.0'
}
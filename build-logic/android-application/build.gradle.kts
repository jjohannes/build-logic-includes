plugins {
    `kotlin-dsl`
}

dependencies {
    implementation(platform(project(":plugins-platform")))

    implementation(project(":commons"))

    implementation("com.android.tools.build:gradle")
    implementation("org.jetbrains.kotlin.android:org.jetbrains.kotlin.android.gradle.plugin")
}

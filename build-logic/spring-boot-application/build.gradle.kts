plugins {
    `kotlin-dsl` // <1>
}

dependencies {
    implementation(platform(project(":plugins-platform"))) // <2>

    implementation(project(":commons")) // <3>

    implementation("org.springframework.boot:org.springframework.boot.gradle.plugin")  // <4>
}

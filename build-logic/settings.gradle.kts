dependencyResolutionManagement {
    repositories {
        gradlePluginPortal()
        google()
    }
}
// TODO not yet working: includeBuild("../platforms")
include("plugins-platform") // <-- platform subproject as replacement for above

rootProject.name = "build-logic"
include("commons")
include("java-library")
include("kotlin-library")
include("android-application")
include("spring-boot-application")
include("report-aggregation")

dependencyResolutionManagement {
    repositories {
        gradlePluginPortal()
        google()
    }
}

includeBuild("../plugins-platform")

rootProject.name = "build-logic"
include("commons")
include("java-library")
include("kotlin-library")
include("android-application")
include("spring-boot-application")
include("report-aggregation")

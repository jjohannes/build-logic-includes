// == Define locations for build logic ==
pluginManagement {
    repositories { gradlePluginPortal(); google() }
    includeBuild("../build-logic")
}

// == Define locations for components ==
dependencyResolutionManagement {
    repositories { mavenCentral() }
}

includeBuild("../server-application")
includeBuild("../android-app")
includeBuild("../aggregation")

includeBuild("../platforms")

includeBuild("../user-feature")
includeBuild("../admin-feature")

includeBuild("../domain-model")
includeBuild("../state")

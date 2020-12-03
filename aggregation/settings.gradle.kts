pluginManagement {
    (this as org.gradle.plugin.management.internal.PluginManagementSpecInternal).includeBuild("../repositories-and-locations")
}
plugins {
    id("com.example.repositories-and-locations")
}

include("test-coverage")


pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
    versionCatalogs {
        create("libs"){
            version("ktor","2.2.2")
            version("coroutine","1.6.4")

            library("client-core","io.ktor","ktor-client-core").versionRef("ktor")
            library("websocket", "io.ktor","ktor-client-websockets").versionRef("ktor")
            library("client-android","io.ktor","ktor-client-cio").versionRef("ktor")
            library("client-ios","io.ktor","ktor-client-darwin").versionRef("ktor")

            library("client-content-neg","io.ktor","ktor-client-content-negotiation").versionRef("ktor")
            library("client-json","io.ktor","ktor-serialization-kotlinx-json").versionRef("ktor")

            library("client-test","io.ktor","ktor-client-mock").versionRef("ktor")
            library("coroutine-core","org.jetbrains.kotlinx","kotlinx-coroutines-core").versionRef("coroutine")
            library("coroutine-test","org.jetbrains.kotlinx","kotlinx-coroutines-test").versionRef("coroutine")


        }
    }
}

rootProject.name = "KtorError"
include(":androidApp")
include(":shared")
package io.github.ktor

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
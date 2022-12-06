package com.fredporciuncula.detekt

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform

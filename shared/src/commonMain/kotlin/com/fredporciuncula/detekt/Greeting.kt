package com.fredporciuncula.detekt

class Greeting {
    private val platform: Platform = getPlatform()

    fun greetings(): String {
        return "Hello, ${platform.name}!"
    }
}

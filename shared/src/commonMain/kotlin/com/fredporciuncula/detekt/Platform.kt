package com.fredporciuncula.detekt

// ✅ this is NOT caught by detekt and detektMain,
//    but is caught by detektMetadataMain (but not by detektMetadataCommonMain?)
class CommonMainEmptyClassBlock {}

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform

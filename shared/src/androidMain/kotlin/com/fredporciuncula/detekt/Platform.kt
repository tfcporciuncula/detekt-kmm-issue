package com.fredporciuncula.detekt

// ✅ this is NOT caught by detekt and detektMain,
//    but is caught by detektAndroidDebug and detektAndroidRelease
class MultiplatformAndroidEmptyClassBlock {}

class AndroidPlatform : Platform {
    override val name: String = "Android ${android.os.Build.VERSION.SDK_INT}"
}

actual fun getPlatform(): Platform = AndroidPlatform()

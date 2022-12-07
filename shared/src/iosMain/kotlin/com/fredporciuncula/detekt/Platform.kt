package com.fredporciuncula.detekt

import platform.UIKit.UIDevice

// ❌ nothing seems to catch this, including
//    detektMetadataIosMain, detektIosX64Main, detektIosArm64Main and detektIosSimulatorArm64Main
class IosMainEmptyClassBlock {}

class IOSPlatform: Platform {
    override val name: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}

actual fun getPlatform(): Platform = IOSPlatform()

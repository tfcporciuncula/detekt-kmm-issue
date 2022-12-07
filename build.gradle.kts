plugins {
    //trick: for the same plugin versions in all sub-modules
    id("com.android.application").version("7.3.1").apply(false)
    id("com.android.library").version("7.3.1").apply(false)
    kotlin("android").version("1.7.20").apply(false)
    kotlin("multiplatform").version("1.7.20").apply(false)
    id("io.gitlab.arturbosch.detekt").version("1.22.0")
}

allprojects {
    apply(plugin = "io.gitlab.arturbosch.detekt")

    detekt {
        config = files("${rootProject.rootDir}/.detekt/detekt.yml")
        buildUponDefaultConfig = true
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}

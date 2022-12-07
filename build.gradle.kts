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

    // with this, the detekt task is able to find issues everywhere
    tasks.withType<io.gitlab.arturbosch.detekt.Detekt> detekt@{
        setSource(files(project.projectDir))
        exclude("**/*.kts")
        exclude("**/build/**")
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}

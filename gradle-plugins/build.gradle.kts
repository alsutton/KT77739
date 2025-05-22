plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

gradlePlugin {
    plugins.register("com.alsutton.kt77739") {
        id = "com.alsutton.kt77739"
        implementationClass = "com.alsutton.kt77739.KT77739"
    }
}

dependencies {
    compileOnly(libs.kotlinGradlePlugin)
}

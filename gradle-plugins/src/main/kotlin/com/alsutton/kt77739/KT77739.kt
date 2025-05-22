package com.alsutton.kt77739

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.compile.JavaCompile
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

class KT77739 : Plugin<Project> {
    override fun apply(project: Project) {
        val frameworkJar = project.rootProject.files("turbine-combined-framework.jar")

        val dependencyHandler = project.dependencies
        dependencyHandler.add("compileOnly", frameworkJar)

        project.afterEvaluate {
            project.tasks.withType(JavaCompile::class.java).forEach { javaCompileTask ->
                javaCompileTask.classpath = frameworkJar
            }
            project.tasks.withType(KotlinCompile::class.java).forEach { kotlinCompileTask ->
                kotlinCompileTask.libraries.from(frameworkJar)
            }
        }
    }
}

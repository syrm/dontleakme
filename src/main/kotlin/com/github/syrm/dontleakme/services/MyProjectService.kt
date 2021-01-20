package com.github.syrm.dontleakme.services

import com.github.syrm.dontleakme.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

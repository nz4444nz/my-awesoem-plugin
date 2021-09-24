package com.github.nz4444nz.myawesoemplugin.services

import com.intellij.openapi.project.Project
import com.github.nz4444nz.myawesoemplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

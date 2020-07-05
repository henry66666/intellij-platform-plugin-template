package com.github.henry66666.intellijplatformplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.henry66666.intellijplatformplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

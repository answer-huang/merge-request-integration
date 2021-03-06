package net.ntworld.mergeRequestIntegrationIdeEE

import com.intellij.openapi.project.Project
import net.ntworld.mergeRequestIntegrationIde.ui.configuration.GitlabConnectionsConfigurableBase

class GitlabConnectionsConfigurable(myIdeaProject: Project) : GitlabConnectionsConfigurableBase(myIdeaProject) {
    override fun getId(): String = "MRI:gitlab-ee"

    override fun getDisplayName(): String = "Gitlab"
}


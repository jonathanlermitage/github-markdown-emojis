package de.achimonline.github_markdown_emojis.settings

import com.intellij.openapi.options.BoundConfigurable
import com.intellij.openapi.ui.DialogPanel
import com.intellij.ui.dsl.builder.LabelPosition
import com.intellij.ui.dsl.builder.bindText
import com.intellij.ui.dsl.builder.panel
import de.achimonline.github_markdown_emojis.bundle.GitHubMarkdownEmojisBundle.message

class GitHubMarkdownEmojisSettingsConfigurable : BoundConfigurable(message("settings.display.name")) {
    private val settings
        get() = GitHubMarkdownEmojisSettingsState.instance.settings

    override fun createPanel(): DialogPanel {
        return panel {
            row {
                textField()
                    .label(message("settings.url.label"), LabelPosition.TOP)
                    .comment(message("settings.url.comment"))
                    .bindText(settings::url)
            }
        }
    }
}

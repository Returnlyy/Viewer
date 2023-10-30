package io.github.returnly.viewer;

import co.aikar.commands.PaperCommandManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Viewer extends JavaPlugin {

    private PaperCommandManager commandManager;

    @Override
    public void onEnable() {
        commandManager = new PaperCommandManager(this);
        registerCommands();
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

    private void registerCommands() {
        // this.commandManager.registerCommand(new Instance(this));
    }
}

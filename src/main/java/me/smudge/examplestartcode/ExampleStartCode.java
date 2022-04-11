package me.smudge.examplestartcode;

import me.smudge.examplestartcode.commands.MainCommand;
import me.smudge.examplestartcode.configs.CConfig;
import org.bukkit.plugin.java.JavaPlugin;

public final class ExampleStartCode extends JavaPlugin {

    @Override
    public void onEnable() {

        // Setup Config
        CConfig.setup();
        CConfig.setupDefaults();
        CConfig.get().options().copyDefaults(true);
        CConfig.save();

        // Setup Commands
        getCommand("ex").setExecutor(new MainCommand(this, "ex"));

    }
}

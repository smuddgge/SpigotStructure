package me.smudge.examplestartcode.commands.subcommands;

import me.smudge.examplestartcode.commands.SubCommand;
import me.smudge.examplestartcode.configs.CConfig;
import me.smudge.examplestartcode.functions.FSend;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;

public class Reload extends SubCommand {
    @Override
    public String getName() {
        return "reload";
    }

    @Override
    public String getDescription() {
        return "Reloads configs";
    }

    @Override
    public ArrayList<ArrayList<String>> getTabComplete() {
        return null;
    }

    @Override
    public String getPermission() {
        return "admin";
    }

    @Override
    public boolean preform(Player player, String[] args, Plugin plugin) {
        CConfig.reload();

        FSend.player(player, "{prefix} Configs reloaded");
        return true;
    }
}

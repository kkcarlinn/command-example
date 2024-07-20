package br.com.unidade.bukkit.example.loader;

import br.com.unidade.bukkit.example.BukkitMain;
import br.com.unidade.engine.command.CommandHandler;

public class Loader {

    public static void loadCommands(String path) {
        CommandHandler.registerCommands(path, BukkitMain.getInstance());
    }
}

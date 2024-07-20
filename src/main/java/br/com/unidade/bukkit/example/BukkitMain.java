package br.com.unidade.bukkit.example;

import br.com.unidade.bukkit.example.loader.Loader;
import br.com.unidade.engine.command.CommandHandler;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

public class BukkitMain extends JavaPlugin {

    @Getter private static BukkitMain instance;

    public BukkitMain() {
        instance = this;
        CommandHandler.setPlugin(this);
    }

    @Override
    public void onLoad() {
        super.onLoad();
    }

    @Override
    public void onEnable() {
        Loader.loadCommands("br.com.unidade.bukkit.example.commands");
        super.onEnable();

    }
}

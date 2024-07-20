package br.com.unidade.bukkit.example.commands;

import br.com.unidade.engine.command.Command;
import br.com.unidade.engine.command.paramter.Param;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;

public final class PrintCommand {

    @Command(names = {"print"}, description = "Broadcast the input to the server.")
    public static void print(CommandSender sender,
                             @Param(name = "message", concated = true) String message) {

        Bukkit.broadcastMessage("§c§lBROADCAST§r " + message);
    }

}

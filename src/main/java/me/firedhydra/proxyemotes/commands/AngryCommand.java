package me.firedhydra.proxyemotes.commands;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.plugin.Command;

public class AngryCommand extends Command{

    public AngryCommand() {
        super("angry");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        if (sender.hasPermission("proxyemote.angry")) {
            ProxyServer.getInstance().getPlayer(sender.getName()).chat("\u0028\u256C \u0CA0\u76CA\u0CA0\u0029");
        } else {
            sender.sendMessage(new TextComponent(ChatColor.RED + "You do not have permission to run this command!"));
        }
    }

}

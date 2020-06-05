package me.firedhydra.proxyemotes.commands;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.plugin.Command;

public class RiotCommand extends Command {

    public RiotCommand() {
        super("riot");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        if (sender.hasPermission("proxyemote.riot")) {
            ProxyServer.getInstance().getPlayer(sender.getName()).chat("\u0B67\u0F3C\u0CA0\u76CA\u0CA0\u0F3D\u0B68");
        } else {
            sender.sendMessage(new TextComponent(ChatColor.RED + "You do not have permission to run this command!"));
        }
    }
}

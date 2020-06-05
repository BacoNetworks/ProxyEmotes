package me.firedhydra.proxyemotes.commands;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.plugin.Command;

public class DisapproveCommand extends Command {

    public DisapproveCommand() {
        super("disapprove");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        if (sender.hasPermission("proxyemote.disapprove")) {
            ProxyServer.getInstance().getPlayer(sender.getName()).chat("\u0CA0\u005F\u0CA0");
        } else {
            sender.sendMessage(new TextComponent(ChatColor.RED + "You do not have permission to run this command!"));
        }
    }
}

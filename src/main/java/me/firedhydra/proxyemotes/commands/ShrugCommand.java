package me.firedhydra.proxyemotes.commands;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.plugin.Command;

public class ShrugCommand extends Command {

    public ShrugCommand() {
        super("shrug");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        if (sender.hasPermission("proxyemote.shrug") || sender.hasPermission("proxyemote.*")) {
            ProxyServer.getInstance().getPlayer(sender.getName()).chat("\u00AF\\\u005F\u0028\u30C4\u0029\u005F\u002F\u00AF");
        } else {
            sender.sendMessage(new TextComponent(ChatColor.RED + "You do not have permission to run this command!"));
        }
    }
}

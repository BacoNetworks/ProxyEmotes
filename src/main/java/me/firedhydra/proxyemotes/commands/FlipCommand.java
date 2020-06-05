package me.firedhydra.proxyemotes.commands;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.plugin.Command;

public class FlipCommand extends Command {

    public FlipCommand() {
        super("flip");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        if (sender.hasPermission("proxyemote.flip")) {
            ProxyServer.getInstance().getPlayer(sender.getName()).chat("\u0028\u256F\u00B0\u25A1\u00B0\uFF09\u256F\uFE35 \u253B\u2501\u253B");
        } else {
            sender.sendMessage(new TextComponent(ChatColor.RED + "You do not have permission to run this command!"));
        }
    }
}

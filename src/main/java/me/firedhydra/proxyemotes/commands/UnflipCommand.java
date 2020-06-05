package me.firedhydra.proxyemotes.commands;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.plugin.Command;

public class UnflipCommand extends Command {

    public UnflipCommand() {
        super("unflip");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        if (sender.hasPermission("proxyemote.unflip") || sender.hasPermission("proxyemote.*")) {
            ProxyServer.getInstance().getPlayer(sender.getName()).chat("\u252C\u2500\u252C \u30CE\u0028 \u309C\u2212\u309C\u30CE\u0029");
        } else {
            sender.sendMessage(new TextComponent(ChatColor.RED + "You do not have permission to run this command!"));
        }
    }
}

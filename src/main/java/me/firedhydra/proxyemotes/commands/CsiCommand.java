package me.firedhydra.proxyemotes.commands;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.plugin.Command;

public class CsiCommand extends Command {

    public CsiCommand() {
        super("csi");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        if (sender.hasPermission("proxyemote.csi") || sender.hasPermission("proxyemote.*")) {
            ProxyServer.getInstance().getPlayer(sender.getName()).chat("\u0028\u2022\u005F\u2022\u0029 \u0028 \u2022\u005F \u2022\u0029\u003E\u2310\u25A0\u005F\u25A0 \u0028\u2310\u25A0\u005F\u25A0\u0029");
        } else {
            sender.sendMessage(new TextComponent(ChatColor.RED + "You do not have permission to run this command!"));
        }
    }

}

package me.firedhydra.proxyemotes.commands;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.plugin.Command;

public class AmenoCommand extends Command{

    public AmenoCommand() {
        super("ameno");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        if (sender.hasPermission("proxyemote.ameno")) {
            ProxyServer.getInstance().getPlayer(sender.getName()).chat("\u0F3C \u3064 \u25D5\u005F\u25D5 \u0F3D\u3064");
        } else {
            sender.sendMessage(new TextComponent(ChatColor.RED + "You do not have permission to run this command!"));
        }
    }

}

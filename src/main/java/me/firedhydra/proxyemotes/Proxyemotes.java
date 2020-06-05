package me.firedhydra.proxyemotes;

import me.firedhydra.proxyemotes.commands.*;
import net.md_5.bungee.api.plugin.Plugin;

public final class Proxyemotes extends Plugin {

    private static Proxyemotes instance;

    @Override
    public void onEnable() {
        instance = this;

        getLogger().info("I have loaded");

        getProxy().getPluginManager().registerCommand(getInstance(), new AmenoCommand());
        getProxy().getPluginManager().registerCommand(getInstance(), new AngryCommand());
        getProxy().getPluginManager().registerCommand(getInstance(), new CsiCommand());
        getProxy().getPluginManager().registerCommand(getInstance(), new DisapproveCommand());
        getProxy().getPluginManager().registerCommand(getInstance(), new FlipCommand());
        getProxy().getPluginManager().registerCommand(getInstance(), new RiotCommand());
        getProxy().getPluginManager().registerCommand(getInstance(), new ShrugCommand());
        getProxy().getPluginManager().registerCommand(getInstance(), new UnflipCommand());

    }

    @Override
    public void onDisable() {
        getLogger().info("I have unloaded");
    }
    public static Proxyemotes getInstance() {
        return instance;
    }
}

package net.lldv.pydow.cosmetics;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.registry.CommandRegistry;
import net.lldv.pydow.cosmetics.commands.CosmeticsCommand;
import net.lldv.pydow.cosmetics.components.manager.ParticleManager;
import net.lldv.pydow.cosmetics.listener.MoveListener;

public class Cosmetics extends PluginBase {

    private static Cosmetics instance;

    @Override
    public void onLoad() {
        instance = this;
        CommandRegistry cr = getServer().getCommandRegistry();
        cr.register(this, new CosmeticsCommand(this));
    }

    @Override
    public void onEnable() {
        ParticleManager.init();
        getServer().getPluginManager().registerEvents(new MoveListener(), this);
    }

    public static Cosmetics getInstance() {
        return instance;
    }
}

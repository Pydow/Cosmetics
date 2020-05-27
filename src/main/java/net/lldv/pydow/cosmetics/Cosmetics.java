package net.lldv.pydow.cosmetics;

import cn.nukkit.plugin.PluginBase;

public class Cosmetics extends PluginBase {

    private static Cosmetics instance;

    @Override
    public void onLoad() {
        instance = this;
    }

    @Override
    public void onEnable() {

    }

    public static Cosmetics getInstance() {
        return instance;
    }
}

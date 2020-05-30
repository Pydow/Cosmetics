package net.lldv.pydow.cosmetics.commands;

import cn.nukkit.command.CommandSender;
import cn.nukkit.command.PluginCommand;
import cn.nukkit.player.Player;
import net.lldv.pydow.cosmetics.Cosmetics;
import net.lldv.pydow.cosmetics.components.manager.FormManager;
import net.lldv.pydow.cosmetics.components.tools.Command;

public class CosmeticsCommand extends PluginCommand<Cosmetics> {

    public CosmeticsCommand(Cosmetics owner) {
        super(owner, Command.create("cosmetics", "Cosmetics",
                new String[]{},
                new String[]{"c"}));
    }

    @Override
    public boolean execute(CommandSender sender, String commandLabel, String[] args) {
        if (sender.isPlayer()) {
            Player player = (Player) sender;
            FormManager.sendMainForm(player);
        }
        return false;
    }
}

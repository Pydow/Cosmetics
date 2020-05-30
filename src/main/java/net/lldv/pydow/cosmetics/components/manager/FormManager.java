package net.lldv.pydow.cosmetics.components.manager;

import cn.nukkit.form.CustomForm;
import cn.nukkit.form.SimpleForm;
import cn.nukkit.player.Player;

public class FormManager {

    public static void sendMainForm(Player player) {
        SimpleForm form = SimpleForm.simple()
                .title("§5Cosmetics")
                .button("§aPartikel", FormManager::sendParticleForm)
                .build();
        player.showFormWindow(form);
    }

    public static void sendParticleForm(Player player) {
        CustomForm form = CustomForm.custom()
                .dropdown("§aLaufpartikel", "")
                .build();
    }


}

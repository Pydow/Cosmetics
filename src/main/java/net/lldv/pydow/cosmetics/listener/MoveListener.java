package net.lldv.pydow.cosmetics.listener;

import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerJoinEvent;
import cn.nukkit.event.player.PlayerMoveEvent;
import cn.nukkit.level.particle.Particle;
import net.lldv.pydow.cosmetics.components.manager.FormManager;
import net.lldv.pydow.cosmetics.components.manager.ParticleManager;

public class MoveListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        ParticleManager.wPPlayers.put(event.getPlayer().getName(), ParticleManager.walkingParticles.get("smoke"));
    }

    @EventHandler
    public void onWalk(PlayerMoveEvent event) {
        if (ParticleManager.wPPlayers.containsKey(event.getPlayer().getName())) {
            Particle p = ParticleManager.wPPlayers.get(event.getPlayer().getName()).getParticle();
            p.setPosition(event.getPlayer().getPosition());
            event.getPlayer().getLevel().addParticle(p);
        }
    }

}

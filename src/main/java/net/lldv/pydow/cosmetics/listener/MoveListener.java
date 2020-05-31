package net.lldv.pydow.cosmetics.listener;

import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerJoinEvent;
import cn.nukkit.event.player.PlayerMoveEvent;
import cn.nukkit.level.particle.Particle;
import com.nukkitx.math.vector.Vector2f;
import com.nukkitx.math.vector.Vector3f;
import net.lldv.pydow.cosmetics.components.data.WalkingParticle;
import net.lldv.pydow.cosmetics.components.manager.FormManager;
import net.lldv.pydow.cosmetics.components.manager.ParticleManager;
import net.lldv.pydow.cosmetics.components.math.CosmeticsMath;

public class MoveListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        ParticleManager.wPPlayers.put(event.getPlayer().getName(), ParticleManager.walkingParticles.get("smoke"));
    }

    @EventHandler
    public void onWalk(PlayerMoveEvent event) {
        if (ParticleManager.wPPlayers.containsKey(event.getPlayer().getName())) {
            WalkingParticle wp = ParticleManager.wPPlayers.get(event.getPlayer().getName());

            if (wp.getLastDraw().containsKey(event.getPlayer().getName())) {
                long lastDraw = wp.getLastDraw().get(event.getPlayer().getName());
                if (lastDraw + 750 > System.currentTimeMillis()) {
                    return;
                } else {
                    wp.getLastDraw().put(event.getPlayer().getName(), System.currentTimeMillis());
                }
            } else wp.getLastDraw().put(event.getPlayer().getName(), System.currentTimeMillis());

            CosmeticsMath.drawCircle(event.getPlayer().getLocation(), wp.getParticle(), 1.5f);
            /*float radius = 1.5f;
            float angle = 20f;

            for (int i = 20; i <= 360; i += 20) {
                float x = event.getPlayer().getPosition().getX(), z = event.getPlayer().getPosition().getZ();
                angle = i;

                float x1 = (float) (radius * Math.cos(angle * Math.PI / 180));
                float y1 = (float) (radius * Math.sin(angle * Math.PI / 180));

                Vector3f pos = Vector3f.from(x + x1, event.getPlayer().getPosition().getY(), z + y1);
                p.setPosition(pos);
                System.out.println(pos.toString());
                event.getPlayer().getLevel().addParticle(p);
            }*/
        }
    }

}

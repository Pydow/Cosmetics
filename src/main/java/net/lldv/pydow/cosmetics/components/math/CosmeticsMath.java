package net.lldv.pydow.cosmetics.components.math;

import cn.nukkit.level.Location;
import cn.nukkit.level.particle.Particle;
import com.nukkitx.math.vector.Vector3f;

import java.util.concurrent.CompletableFuture;

public class CosmeticsMath {

    public static void drawCircle(Location l, Particle particle, float radius) {
        CompletableFuture.runAsync(() -> {
            System.out.println(l.getX() + "/" + l.getY() + "/" + l.getZ());
            float x = l.getX(), y = l.getY(), z = l.getZ();

            for (int i = 20; i <= 360; i += 20) {
                float x1 = (float) (radius * Math.cos((float) i * Math.PI / 180));
                float y1 = (float) (radius * Math.sin((float) i * Math.PI / 180));

                Vector3f pos = Vector3f.from(x + x1, y, z + y1);
                particle.setPosition(pos);
                l.getLevel().addParticle(particle);
            }
        });
    }

}

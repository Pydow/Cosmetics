package net.lldv.pydow.cosmetics.components.manager;

import cn.nukkit.level.particle.Particle;
import cn.nukkit.level.particle.SmokeParticle;
import com.nukkitx.math.vector.Vector3i;
import net.lldv.pydow.cosmetics.components.data.WalkingParticle;

import java.util.HashMap;

public class ParticleManager {

    public static HashMap<String, WalkingParticle> walkingParticles = new HashMap<>();
    public static HashMap<String, WalkingParticle> wPPlayers = new HashMap<>();

    public static void init() {
        registerWalkParticles();
    }

    public static void registerWalkParticles() {
        walkingParticles.put("smoke", new WalkingParticle(new SmokeParticle(Vector3i.from(0, 0, 0))));
    }

}

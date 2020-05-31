package net.lldv.pydow.cosmetics.components.data;

import cn.nukkit.level.particle.Particle;

import java.util.HashMap;

public class WalkingParticle {


    private final Particle particle;
    private HashMap<String, Long> lastDraw = new HashMap<>();

    public WalkingParticle(Particle par) {
        this.particle = par;
    }

    public Particle getParticle() {
        return particle;
    }

    public HashMap<String, Long> getLastDraw() {
        return lastDraw;
    }
}

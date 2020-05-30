package net.lldv.pydow.cosmetics.components.data;

import cn.nukkit.level.particle.Particle;

public class WalkingParticle {

    private final Particle particle;

    public WalkingParticle(Particle par) {
        this.particle = par;
    }

    public Particle getParticle() {
        return particle;
    }
}

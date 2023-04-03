package org.example.units;

import org.example.Position;
import org.example.units.Shooter;

public class Sniper extends Shooter {
    public Sniper(String name, Position position) {
        super(60, name, position, 95, new int[]{6, 12}, 80, 95, 10);

    }

    @Override
    public void Die() {

    }
}

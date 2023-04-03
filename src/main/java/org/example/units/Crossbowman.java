package org.example.units;

import org.example.Position;

import java.util.ArrayList;

/**
 * Арбалетчик
 */
public class Crossbowman extends Shooter {

    public Crossbowman(String name, Position position) {
        super(90, name, position, 100, new int[]{7,19}, 70, 85, 10);
    }

    @Override
    public void step(ArrayList<BaseHero> enemyTeam) {

    }

    @Override
    public void Die() {

    }
}

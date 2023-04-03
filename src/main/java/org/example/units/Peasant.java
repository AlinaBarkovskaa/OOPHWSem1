package org.example.units;

import org.example.Position;
import org.example.units.BaseHero;

import java.util.ArrayList;

/**
 * Крестьянин
 */
public class Peasant extends BaseHero {
    private int invisible; // невидимость
    public int getInvisible() {
        return invisible;
    }
    public void setInvisible(int invisible) {
        this.invisible = invisible;
    }

    public Peasant(String name, Position position) {
        super(50, name, position, 0, new int[] {1, 2}, 55 );
        invisible = 10;
    }

    @Override
    public void step(ArrayList<BaseHero> enemyTeam) {

    }

    @Override
    public void Die() {

    }
}


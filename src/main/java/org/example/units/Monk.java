package org.example.units;

import org.example.Position;
import org.example.units.BaseHero;

import java.util.ArrayList;

public class Monk extends BaseHero {
    private int holyWater;
    private int power;

    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }

    public Monk(String name, Position position) {
        super(100, name, position, 0, new int[]{1,2}, 100, 3);
        holyWater = 10;
        power = 5;
    }

    @Override
    public void step(ArrayList<BaseHero> arrayFriend, ArrayList<BaseHero> arrayEnemy) {

    }

    @Override
    public void Die() {

    }
}
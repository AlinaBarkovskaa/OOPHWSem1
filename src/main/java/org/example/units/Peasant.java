package org.example.units;
import org.example.Position;
import org.example.units.BaseHero;
import java.util.ArrayList;

public class Peasant extends BaseHero {
    public Peasant(String name, Position position) {
        super(50, name, position, 0, new int[] {1, 2}, 55 , 10);
    }
    @Override
    public void step(ArrayList<BaseHero> arrayFriend, ArrayList<BaseHero> arrayEnemy) {
        //System.out.println("Ходит " + getInfo() + " " + getName());
        if (state == State.dead) return;
        state = State.stand;
    }
}
package org.example.units;
import org.example.Position;
import org.example.units.BaseHero;
import java.util.ArrayList;
import java.util.Objects;
/**
 * Крестьянин
 */
public class Peasant extends BaseHero {
    public Peasant(String name, Position position) {
        super(50, name, position, 0, new int[] {1, 2}, 55 , 10);
    }
    @Override
    public void step(ArrayList<BaseHero> arrayFriend, ArrayList<BaseHero> arrayEnemy) {
        System.out.println("Ходит " + getInfo() + " " + getName());
        if (state == State.dead) return;
        state = State.stand;
        System.out.println("Состояние: " + state);
        System.out.println("    ========= Конец хода крестьянина=========");
    }

    @Override
    public void Die() {

    }
}
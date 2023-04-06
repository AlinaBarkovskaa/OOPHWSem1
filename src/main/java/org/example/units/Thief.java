package org.example.units;
import org.example.Position;
import org.example.units.BaseHero;
import java.util.ArrayList;

public class Thief extends BaseHero {
    private int knife;

    public int getKnife() {
        return knife;
    }
    public void setKnife(int knife) {
        this.knife = knife;
    }

    public Thief(String name, Position position){
        super(70, name, position, 80, new int[]{8, 10}, 50, 7);
        int knife = 10; // кол ножей
    }

    @Override
    public void step(ArrayList<BaseHero> arrayFriend , ArrayList<BaseHero> arrayEnemy) {
    }

    @Override
    public void Die() {

    }
}
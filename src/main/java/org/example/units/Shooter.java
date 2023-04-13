package org.example.units;
import org.example.GameInterface;
import org.example.Position;
import java.util.ArrayList;
import java.util.Random;
public abstract class Shooter extends BaseHero implements GameInterface {
    protected int arrows = 10; // стрелы
    protected int maxArrows;

    public Shooter(float hp, String name, Position position, int attack,
                   int[] damage, int def,  int arrows, int prioritet) {
        super(hp, name, position, attack, damage, def, prioritet);
        this.arrows = arrows;
        maxArrows = arrows;
    }
    public void step(ArrayList<BaseHero> arrayFriend, ArrayList<BaseHero> arrayEnemy) {
        if (state == State.dead) return;
        for (BaseHero friend : arrayFriend) {
            if (friend.getClass().getSimpleName().equals("Peasant")
                    && friend.getState().equals(State.stand)) {
                friend.state = State.busy;
                arrows++;
                //System.out.println("Нашел крестьянина, стрел стало " + arrows);
                break;
            }
        }
        if (arrows > 0) {
            BaseHero nearEnemy = findNearPerson(arrayEnemy);
            if (nearEnemy.getHp() > 0) {
                Random r = new Random();
                nearEnemy.getDamage(r.nextInt(damage[0], damage[1] + 1)); // урон противника
                arrows--;
            }
        }
    }
    @Override
    public String getInfo() {
        return this.getClass().getSimpleName();
    }
    @Override
    public String toString() {
        return name +
                " Hp:" + Math.round(hp) +
                " Def:" + def +
                " Att:" + attack +
                " Dmg:" + Math.round(Math.abs((damage[0] + damage[1])/2)) +
                " Arr:" + arrows +
                " " + state;
    }
}
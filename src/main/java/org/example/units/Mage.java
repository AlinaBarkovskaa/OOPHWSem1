package org.example.units;
import org.example.GameInterface;
import org.example.Position;
import java.util.ArrayList;
import java.util.Random;
public abstract class Mage extends BaseHero implements GameInterface {
    protected int manna;
    public Mage(float hp, String name, Position position, int attack, int[] damage, int def, int priority, int manna) {
        super(hp, name, position, attack, damage, def, priority);
        this.manna = manna;
    }
    public void step(ArrayList<BaseHero> arrayFriend, ArrayList<BaseHero> arrayEnemy) {
        BaseHero nearOwn = findNearPerson(arrayFriend);
        if (nearOwn.getHp() > 0 & nearOwn.getHp() < nearOwn.getMaxhp()) {
            Random r = new Random();
            nearOwn.takeHealth(r.nextInt(damage[0], damage[1] + 1));
            manna -= 1;
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
                " Man" + manna +
                " " + state;
    }
}
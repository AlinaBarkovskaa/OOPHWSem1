package org.example.units;
import org.example.GameInterface;
import org.example.Position;
import java.util.ArrayList;
public abstract class BaseHero implements GameInterface {
    protected Float hp, maxhp; // здоровье
    protected String name;
    protected Position position;
    protected int attack;
    protected int[] damage; // урон
    protected int def; // защита
    protected int priority;
    protected enum State {stand, busy, dead}
    protected State state;
    public State getState() {
        return state;
    }
    public void setPriority(int priority) {
        this.priority = priority;
    }
    public int getPriority() {
        return priority;
    }
    public Float getHp() {
        return hp;
    }
    public Float getMaxhp() {
        return maxhp;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public BaseHero(float hp, String name, Position position, int attack, int[] damage, int def, int priority) {
        this.hp = this.maxhp = hp;
        this.name = name;
        this.position = position;
        this.attack = attack;
        this.damage = damage;
        this.def = def;
        this.priority = priority;
        this.state = State.stand;
    }
    @Override
    public  abstract void step(ArrayList<BaseHero> arrayFriend, ArrayList<BaseHero> arrayEnemy);
    @Override
    public String getInfo() {
        return this.getClass().getSimpleName();
    }
    public BaseHero findNearPerson(ArrayList<BaseHero> personTeam) {
        BaseHero nearEnemy = personTeam.get(0);
        double distance = position.distance(personTeam.get(0).position);
        double minDistance = distance;
        for (int i = 1; i < personTeam.size(); i++) {
            if (personTeam.get(i).hp <= 0) continue; // если неживой
            distance = position.distance(personTeam.get(i).position);
            if (minDistance > distance) {
                minDistance = distance;
                nearEnemy = personTeam.get(i);
            }
        }
        return nearEnemy;
    }
    protected void getDamage (float damage) {
        hp -= damage;
        if (hp <= 0) {
            state = State.dead;
        }
    }
    protected void takeHealth(float damage) {
        hp += damage;
        if (hp >= maxhp) {
            hp = maxhp;
        }
    }
    public int[] getCoord() {
        return new int[]{position.getX(),position.getY()};
    }
    @Override
    public String toString() {
        return name +
                " Hp:" + Math.round(hp) +
                " Def:" + def +
                " Att:" + attack +
                " Dmg:" + Math.round(Math.abs((damage[0] + damage[1])/2)) +
                " " + state;
    }
}
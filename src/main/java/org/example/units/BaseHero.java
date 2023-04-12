package org.example.units;
import org.example.GameInterface;
import org.example.Position;
import java.util.ArrayList;
public abstract class BaseHero implements GameInterface {
    protected Float hp, maxhp;
    protected String name;
    protected Position position;
    protected int attack;
    protected int[] damage;
    protected int def;
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
    public void setHp(Float hp) {
        this.hp = hp;
    }
    public Float getMaxhp() {
        return maxhp;
    }
    public void setMaxhp(Float maxhp) {
        this.maxhp = maxhp;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAttack() {
        return attack;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }
    public int getDef() {
        return def;
    }
    public void setDef(int def) {
        this.def = def;
    }
    /**
     * конструктор
     * @param hp
     * @param maxhp
     * @param name
     * @param position
     * @param attack
     * @param damage
     * @param def
     */
    public BaseHero(float hp, String name, Position position, int attack, int[] damage, int def, int priority) {
        this.hp = this.maxhp = hp;
        this.name = name;
        this.position = new Position(position.x, position.y);
        this.attack = attack;
        this.damage = damage;
        this.def = def;
        this.priority = priority;
        this.state = State.stand;
    }
    /**
     * абстрактный метод, реализация проведена в наследниках
     * @param arrayFriend
     * @param arrayEnemy
     */
    @Override
    public  abstract void step(ArrayList<BaseHero> arrayFriend, ArrayList<BaseHero> arrayEnemy);
    @Override
    public String getInfo() {
        return this.getClass().getSimpleName();
    }
    /**
     * находит и возвращает ближайшего врага, принимает список
     * @param enemyTeam
     * @return
     */
    public BaseHero findNearEnemy(ArrayList<BaseHero> enemyTeam) {
        BaseHero nearEnemy = enemyTeam.get(0);
        double distance = position.distance(enemyTeam.get(0).position);
        double minDistance = distance;
        for (int i = 1; i < enemyTeam.size(); i++) {
            if (enemyTeam.get(i).hp <= 0) continue; // если неживой
            distance = position.distance(enemyTeam.get(i).position);
            if (minDistance > distance) {
                minDistance = distance;
                nearEnemy = enemyTeam.get(i);
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
    public int[] getCoord() {
        return new int[]{position.x,position.y};
    }
    @Override
    public String toString() {
        return name +
                " H:" + Math.round(hp) +
                " D:" + def +
                " A:" + attack +
                " Dmg:" + Math.round(Math.abs((damage[0] + damage[1])/2)) +
                " " + state;
    }

    public abstract void Die();

}
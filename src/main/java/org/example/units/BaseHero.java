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
    public int[] getDamage() {
        return damage;
    }
    public void setDamage(int[] damage) {
        this.damage = damage;
    }

    /**
     * конструктор
     * @param hp
//     * @param maxhp
     * @param name
     * @param position
     * @param attack
     * @param damage
     * @param def
     */
    public BaseHero(float hp, String name, Position position, int attack, int[] damage, int def) {
        this.hp = this.maxhp = hp;
        this.name = name;
        this.position = new Position(position.x, position.y);
        this.attack = attack;
        this.damage = damage;
        this.def = def;
    }

    @Override
    public  void step(ArrayList<BaseHero> enemyTeam) {

    }

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

    /**
     * абстрактный метод
     */
    public abstract void Die();

}

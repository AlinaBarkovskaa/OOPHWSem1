package org.example.units;
import org.example.Position;
import org.example.units.BaseHero;
import java.util.ArrayList;

public class Mage extends BaseHero {
    private int potion, maxPotion; // количество зелья
    private int power; // мощность зелья

    public int getMaxPotion() {
        return maxPotion;
    }
    public void setMaxPotion(int maxPotion) {
        this.maxPotion = maxPotion;
    }
    public int getPotion() {
        return potion;
    }
    public void setPotion(int potion) {
        this.potion = potion;
    }
    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }
    public Mage(String name, Position position) {
        super(90, name, position, 0, new int[]{1,2}, 100,5);
        potion = 10;
        maxPotion = potion;
        power = 3;
    }
    @Override
    public void step(ArrayList<BaseHero> arrayFriend, ArrayList<BaseHero> arrayEnemy) {

    }
    @Override
    public void Die() {
    }
}
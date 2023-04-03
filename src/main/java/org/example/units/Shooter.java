package org.example.units;
import org.example.GameInterface;
import org.example.Position;
import org.example.units.BaseHero;

import java.util.ArrayList;
public abstract class Shooter extends BaseHero implements GameInterface {
    protected int accuracy; // точность
    protected int arrows = 10; // стрелы
    protected int maxArrows;

    public int getMaxArrows() {
        return maxArrows;
    }
    public void setMaxArrows(int maxArrows) {
        this.maxArrows = maxArrows;
    }
    public int getArrows() {
        return arrows;
    }
    public void setArrows(int arrows) {
        this.arrows = arrows;
    }
    public int getAccuracy() {
        return accuracy;
    }
    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public Shooter(float hp, String name, Position position, int attack, int[] damage, int def, int accuracy, int arrows) {
        super(hp, name, position, attack, damage, def);
        this.arrows = arrows;
        maxArrows = arrows;
        this.accuracy = accuracy;
    }

    public void step(ArrayList<BaseHero> enemyTeam) {
        System.out.println("Ходит " + getInfo() + " " + getName());
        if (hp <= 0 || arrows <= 0) return;
        System.out.println("Ищу ближайшего противника!");
        BaseHero closestEnemy = findNearEnemy(enemyTeam);
        System.out.println("Найден ближайший противник: " + closestEnemy.getInfo() + " " + getName());
        System.out.println("Стреляю!");
        shoot();
        System.out.println("Проверяю есть ли в моей команде Peasant..если он есть то завершаю ход, если нет то уменьшаю количество стрел");
        checkPeasant();
        //если крестьянин найден return;
        System.out.println("Конец данного хода.");
    }
    private void shoot() { //что еще надо прописать в выстреле? уменьшить здоровье?
        arrows--;
    }
    private void checkPeasant() {
        if (1 > 0) {// если крестьянин есть
            return;
        } else {
            arrows--;
        }
    }
}
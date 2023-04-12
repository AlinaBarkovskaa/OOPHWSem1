package org.example.units;
import org.example.GameInterface;
import org.example.Position;
import java.util.ArrayList;
import java.util.Random;
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
    public Shooter(float hp, String name, Position position, int attack,
                   int[] damage, int def, int accuracy, int arrows, int prioritet) {
        super(hp, name, position, attack, damage, def, prioritet);
        this.arrows = arrows;
        maxArrows = arrows;
        this.accuracy = accuracy;
    }
    public void step(ArrayList<BaseHero> arrayFriend, ArrayList<BaseHero> arrayEnemy) {
        System.out.println("Ходит " + getInfo() + " " + getName());
        if (state == State.dead) return;
        for (BaseHero friend : arrayFriend) {
            if (friend.getClass().getSimpleName().equals("Peasant")
                    && friend.getState().equals(State.stand)) {
                friend.state = State.busy;
                arrows++;
                System.out.println("Нашел крестьянина, стрел стало " + arrows);
                break;
            }
        }
        if (arrows > 0) {
            BaseHero closestEnemy = findNearEnemy(arrayEnemy);
            System.out.println("Найден ближайший противник: " + closestEnemy.getInfo() + " " + closestEnemy.getName());
            //checkPeasant(arrayFriend);
            Random r = new Random();
            closestEnemy.getDamage(r.nextInt(damage[0], damage[1]+1)); // урон противника
            System.out.println(this.getInfo() + this.getName() + " стреляет в " + closestEnemy.getInfo() + " " + closestEnemy.getName());
            arrows--;
        }
        System.out.println("Осталось " + arrows + " стрел");
        System.out.println("Конец хода shooter");
    }

    @Override
    public String getInfo() {
        return this.getClass().getSimpleName();
    }
}
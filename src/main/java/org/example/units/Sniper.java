package org.example.units;

public class Sniper extends BaseHero {

    int arrows;
    /**Точность*/
    int accuracy;

    public Sniper(String name) {
        super(150, name, 1, 6, 12, 50, new int[]{6,12}, "Snipre");
        arrows = 10;
        accuracy = 70;
    }
}

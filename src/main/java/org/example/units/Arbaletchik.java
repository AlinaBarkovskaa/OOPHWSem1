package org.example.units;

public class Arbaletchik extends BaseHero{
    int arrows;
    /**Точность*/
    int accuracy;

    public Arbaletchik(String name) {
        super(150, name, 4, 8, 14, 75, new int[]{8,14}, "Arbaletchik");
        arrows = 10;
        accuracy = 50;
    }
}

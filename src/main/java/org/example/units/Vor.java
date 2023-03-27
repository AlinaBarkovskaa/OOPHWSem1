package org.example.units;

public class Vor extends BaseHero{
    Boolean stealthMode;
    int hiddenStrike;
    public Vor(String name) {
        super(100, name, 3, 4, 10, 100, new int[]{4, 12}, "Vor");
        stealthMode = true;
        hiddenStrike = 40;

    }
}
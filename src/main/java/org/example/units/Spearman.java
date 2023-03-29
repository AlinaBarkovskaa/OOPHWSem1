package org.example.units;

import org.example.Spells;

import java.util.ArrayList;

public class Spearman extends BaseHero {
    public Spearman(String name) {
        super(200, name, 4, 7, 16, 90, new int[]{10, 20}, "Spearman");


    }
    @Override
    public String GetInfo() {
        return "Копейщик";
    }
}

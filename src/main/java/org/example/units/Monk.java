package org.example.units;

import org.example.Spells;

import java.util.ArrayList;

public class Monk extends BaseHero {
    public ArrayList<Spells> spells = new ArrayList<Spells>();
    int mana;

    public Monk(String name) {
        super(150, name, 3, 3, 30, 80, new int[]{6, 9}, "Monk");
        mana = 80;
        spells.add(new Spells("Фаербол"));
        spells.add(new Spells("Лечение"));
        spells.add(new Spells("Увеличение брони"));
        spells.add(new Spells("Увеличение урона"));
    }
    @Override
    public String GetInfo() {
        return "Монах";
    }
}

package org.example.units;

import org.example.Spells;

import java.util.ArrayList;
public class Mage extends BaseHero{
    public ArrayList<Spells> spells = new ArrayList<Spells>();
    int mana;
    public Mage(String name) {
        super(120, name, 2, 3, 20, 80, new int[]{3,5}, "Mage");
        mana = 100;
        spells.add(new Spells("Фаербол"));
        spells.add(new Spells("Лечение"));
        spells.add(new Spells("Увеличение брони"));
        spells.add(new Spells("Увеличение урона"));
    }
    @Override
    public String GetInfo() {
        return "Маг";
    }
}

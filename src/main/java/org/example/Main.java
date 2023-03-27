package org.example;

import org.example.units.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<BaseHero> hero = new ArrayList<>();
        hero.add(new Sniper("Ivan"));
        hero.add(new Arbaletchik("Lexa"));
        hero.add(new Mage("Stas"));
        hero.add(new Monk("Oleg"));
        hero.add(new Spearman("Fedor"));
        hero.add(new Vor("Sema"));
        hero.add(new Peasant("Ilia"));
        hero.forEach(n -> System.out.println(n));


    }
}
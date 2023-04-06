package org.example;
import org.example.units.*;
import java.util.ArrayList;
import java.util.Random;

public class Additionally {
    public Additionally() {

    }
    public static ArrayList<BaseHero> getListOwn(ArrayList<BaseHero> arrayList) {
        Random random = new Random();
        int size = 10;
        int y1 = 0;
        int y2 = size - 1;
        for (int i = 0; i < 10; i++) {
            switch (random.nextInt(7)) {
                case 0 -> arrayList.add(new Spearman(getRandomName(), new Position(i, y1)));
                case 1 -> arrayList.add(new Sniper(getRandomName(), new Position(i, y1)));
                case 2 -> arrayList.add(new Crossbowman(getRandomName(), new Position(i, y1)));
                case 3 -> arrayList.add(new Peasant(getRandomName(), new Position(i, y1)));
                case 4 -> arrayList.add(new Monk(getRandomName(), new Position(i, y1)));
                case 5 -> arrayList.add(new Mage(getRandomName(), new Position(i, y1)));
                default -> arrayList.add(new Thief(getRandomName(), new Position(i, y1)));
            }
        }
        return arrayList;
    }
    public static ArrayList<BaseHero> getListEnemy(ArrayList<BaseHero> arrayList) {
        Random random = new Random();
        int size = 10;
        int y1 = 0;
        int y2 = size - 1;
        for (int i = 0; i < 10; i++) {
            switch (random.nextInt(7)) {
                case 0 -> arrayList.add(new Spearman(getRandomName(), new Position(i, y2)));
                case 1 -> arrayList.add(new Sniper(getRandomName(), new Position(i, y2)));
                case 2 -> arrayList.add(new Crossbowman(getRandomName(), new Position(i, y2)));
                case 3 -> arrayList.add(new Peasant(getRandomName(), new Position(i, y2)));
                case 4 -> arrayList.add(new Monk(getRandomName(), new Position(i, y2)));
                case 5 -> arrayList.add(new Mage(getRandomName(), new Position(i, y2)));
                default -> arrayList.add(new Thief(getRandomName(), new Position(i, y2)));
            }
        }
        return arrayList;
    }
    public static String getRandomName() {
        return Names.values()[new Random().nextInt(Names.values().length)].toString();
    }

}
package org.example;
import org.example.units.BaseHero;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
public class Main  {
    static ArrayList<BaseHero> teamOwn = new ArrayList<>();
    static ArrayList<BaseHero> teamEnemy = new ArrayList<>();
    static ArrayList<BaseHero> teamAll = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("Список своих");
        Additionally.getList(teamOwn, 1);//вызов статического метода, обращаемся к классу!
        teamOwn.forEach(n -> System.out.println(n.getInfo() + " " + n.getName() + " (здоровье " + n.getHp() + ")"));
        System.out.println("Список противников");
        Additionally.getList(teamEnemy, 10);
        teamEnemy.forEach(n -> System.out.println(n.getInfo() + " " + n.getName() + " (здоровье " + n.getHp() + ")"));
        System.out.println("Cписок объединенных отсортированных по приоритету команд " +
                "" +
                "" +
                "" +
                "");
        teamAll.addAll(teamOwn);
        teamAll.addAll(teamEnemy);
        // сортировка по приоритету
        teamAll.sort(new Comparator<BaseHero>() {
            @Override
            public int compare(BaseHero o1, BaseHero o2) {
                if (o1.getPriority() == o2.getPriority()) {
                    return (int)(o1.getHp()/o1.getMaxhp() - o2.getHp()/o2.getMaxhp());
                }
                return o1.getPriority() - o2.getPriority();
            }
        });
        Scanner scanner = new Scanner(System.in);
        while (true) {
            View.view();
            for (BaseHero hero : teamAll
            ) {
                if (teamOwn.contains(hero))
                    hero.step(teamOwn, teamEnemy);
                else {
                    hero.step(teamEnemy, teamOwn);
                }
            }
            scanner.nextLine();
        }

    }
}
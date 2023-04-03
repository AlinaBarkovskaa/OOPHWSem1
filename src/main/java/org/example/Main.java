import org.example.*;
import org.example.units.BaseHero;
import java.util.ArrayList;

public class Main  {
    public static void main(String[] args) {
        ArrayList<BaseHero> teamOwn = new ArrayList<>();
        ArrayList<BaseHero> teamEnemy = new ArrayList<>();
        System.out.println("   Список своих");
        Additionally.getListOwn(teamOwn);//вызов статического метода, обращаемся к классу!
        teamOwn.forEach(n -> System.out.println(n.getInfo() + " " + n.getName()));
        System.out.println("Список противников");
        Additionally.getListEnemy(teamEnemy);
        teamEnemy.forEach(n -> System.out.println(n.getInfo() + " " + n.getName()));
        System.out.println("Начало игры");
        teamOwn.forEach(n -> n.step(teamEnemy));
        teamEnemy.forEach(n -> n.step(teamOwn));

    }
}
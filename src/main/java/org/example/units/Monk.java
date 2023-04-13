package org.example.units;
import org.example.Position;
import org.example.units.BaseHero;
import java.util.ArrayList;
public class Monk extends Mage {
    public Monk(String name, Position position) {
        super(100, name, position, 0, new int[]{1,2}, 100, 3, 10);
    }
}
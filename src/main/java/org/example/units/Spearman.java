package org.example.units;
import org.example.Position;
public class Spearman extends Soldiers {
    private int spear;
    public int getSpear() {
        return spear;
    }
    public void setSpear(int spear) {
        this.spear = spear;
    }
    public Spearman(String name, Position position) {
        super(70, name, position, 100, new int[]{8,10}, 50, 8);
        spear = 10;
    }
}
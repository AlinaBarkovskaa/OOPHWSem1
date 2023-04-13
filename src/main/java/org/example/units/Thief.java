package org.example.units;
import org.example.Position;

public class Thief extends Soldiers {
    public Thief(String name, Position position){
        super(70, name, position, 80, new int[]{8, 10}, 50, 7);
    }
}
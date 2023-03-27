package org.example.units;

public abstract class BaseHero {
    protected String className;
    float hp, maxHp;
    String name;
    int x, y;
    int ataka;
    int def;
    int armor;
    int[] damage;
    @Override public String toString(){
        return name + " " + hp + " " + ataka + " " + className + " " ;
    }
    public BaseHero(float hp, String name, int x, int y, int ataka, int def, int[] damage, String className){
        this.hp = this.maxHp = hp;
        this.name = name;
        this.x = x;
        this.y = y;
        this.ataka = ataka;
        this.def = def;
        this.damage = damage;
        this.className = className;
    }
}

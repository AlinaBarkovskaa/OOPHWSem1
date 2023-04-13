package org.example;
public class Position {
    private int x, y;
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x += x;
    }
    public void setY(int y) {
        this.y += y;
    }
    public int getY() {
        return y;
    }
    public double distance(Position defender) {
        return Math.sqrt((defender.x - x)*(defender.x - x) + (defender.y - y)*(defender.y - y));
    }
}
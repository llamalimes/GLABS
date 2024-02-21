package org.jonlima.glab303_10_4;

public class Triangle extends Shape implements Movable {
    private double base;
    private double height;
    private int x, y;

    public Triangle(double base, double height, int x, int y) {
        this.base = base;
        this.height = height;
        this.x = x;
        this.y = y;
    }

    @Override
    public double getArea() {
        double area = (base * height) / 2;
        return area;
    }

    @Override
    public void displayshapName() {
        System.out.println("Drawing a Triangle of base " + this.base + " and height " + this.height);
    }

    @Override
    public String toString() {
        return "Triangle[ base = " + this.base + " height =  " + this.height + super.toString() + "] ";
    }
    public String getCoordinate()
    {
        return "(" + x + "," + y + ")";
    }
    @Override
    public void moveUp() {
        y++;
    }
    @Override
    public void moveDown() {
        y--;
    }
    @Override
    public void moveLeft() {
        x--;
    }
    @Override
    public void moveRight() {
        x++;
    }
}

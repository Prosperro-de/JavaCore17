package org.example.module6;

import java.util.Objects;

public class Demo {
    public static void main(String[] args) {
        Point firstPoint = new Point();
        firstPoint.setX(5);
        firstPoint.setY(10);
        Point secondPoint = new Point();
        secondPoint.setX(5);
        secondPoint.setY(10);
        System.out.println(firstPoint.equals(secondPoint));

    }
}

class Point {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
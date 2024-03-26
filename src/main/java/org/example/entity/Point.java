package org.example.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("pointBean")
//@Scope("prototype")
public class Point extends Shape {

    public Point(@Value("#{coordsBean}") Coords coords) {
        this.coords = coords;
    }


    private Coords coords;

    public Coords getCoords() {
        return coords;
    }

    public void setCoords(Coords coords) {
        this.coords = coords;
    }


    public int getX() {
        return getCoords().getX();
    }

    @Value("#{T(java.lang.Math).random()*30}")
    private void setX(int x) {
        getCoords().setX(x);
    }

    public int getY() {
        return getCoords().getY();
    }

    @Value("#{T(java.lang.Math).random()*50}")
    private void setY(int y) {
        getCoords().setY(y);
    }


    @Override
    public void draw() {
        System.out.printf("Point is (%d, %d) and color - %s%n", getX(), getY(), getColor());
    }
}

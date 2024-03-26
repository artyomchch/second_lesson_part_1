package org.example.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("circleBean")
@Scope("prototype")
public class Circle extends Shape {

    private Coords coords;
    private int radius;

    public Coords getCoords() {
        return coords;
    }


    public void setCoords(Coords coords) {
        this.coords = coords;
    }


    @Autowired
    public Circle(Coords coords) {
        this(coords, 0);
        System.out.println("Work first construcotr");
    }

    public Circle(Coords coords, int radius) {

        super();
        this.coords = coords;
        this.radius = radius;
        System.out.println("Work second constructor");
    }

    public int getX() {
        return getCoords().getX();
    }


    private void setX(int x) {
        getCoords().setX(x);
    }

    public int getY() {
        return getCoords().getY();
    }

    private void setY(int y) {
        getCoords().setY(y);
    }


    public int getRadius() {
        return radius;
    }

    @Value("#{T(java.lang.Math).sqrt(pointBean.x*pointBean.x + pointBean.y * pointBean.y)}")
    // @Value("#{T(java.lang.Math).random()*20}")
    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.printf("Circle radius is %s and coords (%s, %s) and color - %s%n", getRadius(),
                getCoords().getX(), getY(), getColor());
    }

    @Value("${circle.color}")
    @Override
    public void setColor(String color) {
        super.setColor(color);
    }
}

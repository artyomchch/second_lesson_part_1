package org.example.entity;

import org.springframework.beans.factory.annotation.Value;

public abstract class Shape {


    private String color;

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Value("${point.color}")
    public void setColor(String color) {
        this.color = color;
    }

    abstract public void draw();
}

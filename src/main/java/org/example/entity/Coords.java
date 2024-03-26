package org.example.entity;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("coordsBean")
@Scope("prototype")
public class Coords {
    public Coords() {
    }

    public Coords(int x, int y) {
        this.x = x;
        this.y = y;
    }

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
}

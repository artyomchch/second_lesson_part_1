package org.example;

import org.example.entity.Shape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;

@Component("sceneBean")
public class Scene {


//    private static Scene instance = null;
//
//    public static synchronized Scene getInstance(){
//        if (instance ==  null) instance = new Scene();
//        return instance;
//    }

    Collection<Shape> figure;

    public Scene(Collection<Shape> figure) {
        this.figure = figure;
    }

    public Collection<Shape> getFigure() {
        return figure;
    }

    public void setFigure(Collection<Shape> figure) {
        this.figure = figure;
    }


    public void draw() {
        for (Shape s : getFigure()) {
            s.draw();
        }
    }
}

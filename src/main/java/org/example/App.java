package org.example;

import org.example.entity.Circle;
import org.example.entity.Point;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
        context.getBean("pointBean", Point.class).draw();
        context.getBean("circleBean", Circle.class).draw();
        context.getBean("sceneBean", Scene.class).draw();
        context.close();
    }
}

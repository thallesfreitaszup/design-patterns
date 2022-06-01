package org.example.creational.prototype;

public class Circle extends Shape {

    public Circle(Circle circle) {
        super();
        this.weight = circle.weight;
        this.widht = circle.widht;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }
}

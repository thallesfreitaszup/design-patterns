package org.example.prototype;

public class Rectangle extends Shape {

    public Rectangle(Rectangle rectangle) {
        super();
        this.weight = rectangle.weight;
        this.widht = rectangle.widht;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
}

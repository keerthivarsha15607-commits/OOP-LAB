interface Shape {
    double area();
    void display();
}

class Circle implements Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public void display() {
        System.out.println("Circle Area: " + area());
    }
}

class Rectangle implements Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    public double area() {
        return length * width;
    }

    public void display() {
        System.out.println("Rectangle Area: " + area());
    }
}

public class AbstractionDemo2 {
    public static void main(String[] args) {
        Shape s;

        s = new Circle(5);
        s.display();

        s = new Rectangle(4, 6);
        s.display();
    }
}
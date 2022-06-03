package Prototype;

public class Circle extends Shape {
    public String name;

    public Circle() {

    }

    public Circle(Circle circle) {
        super(circle);
        if (circle != null) {
            this.name = circle.name;
        }
    }

    @Override
    public Circle clone() {
        return new Circle(this);
    }

    public boolean equals(Object object2) {
        if (!(object2 instanceof Circle) || !super.equals(object2)) return false;
        Circle circle2 = (Circle) object2;
        return name.equals(circle2.name);
    }
}

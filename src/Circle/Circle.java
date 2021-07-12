package Circle;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        radius = 1.0;
        color = "green";
    }

    public Circle(double _radius, String _color) {
        radius = _radius;
        color = _color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPrimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A circle with radius = " + radius + ": " + color;
    }

    public static void main(String[] args) {
        Circle cir1 = new Circle();
        Circle cir2 = new Circle(2.0,"red");
        System.out.println(cir1);
        System.out.println(cir2);
    }
}

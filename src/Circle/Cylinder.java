package Circle;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        height = 1.0;
    }

    public Cylinder(double _height, double _radius, String _color) {
        super(_radius, _color);
        height = _height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    public String toString() {
        return "A cylinder has radius = " + getRadius() +
                " ,is a subclass of Circle " + super.toString();
    }

    public static void main(String[] args) {
        Cylinder cyl1 = new Cylinder();
        Cylinder cyl2 = new Cylinder(10.0, 2, "blue");
        System.out.println(cyl1);
        System.out.println(cyl2);
    }
}

package Triagle;


public class Triagle extends Shape {
    private double side1, side2, side3;

    public Triagle() {
        side1 = 1;
        side2 = 1;
        side3 = 1;
    }

    public Triagle(double _side1, double _side2, double _side3) {
        boolean condition1 = (_side1 + _side2) > _side3;
        boolean condition2 = (_side3 + _side2) > _side1;
        boolean condition3 = (_side1 + _side3) > _side2;
        if (condition1 && condition2 && condition3) {
            side1 = _side1;
            side2 = _side2;
            side3 = _side3;

        } else {
            System.out.println("No exist");
        }
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        double p = 0.5 * (side1 + side2 + side3);
        return Math.pow(p * (p - side1) * (p - side2) * (p - side3), 0.5);
    }

    public double getPrimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triagle{" +
                "side1= " + side1 +
                ", side2= " + side2 +
                ", side3= " + side3 +
                super.toString() +
                '}';
    }

    public static void main(String[] args) {
        Triagle tri1 = new Triagle();
        System.out.println(tri1);
        System.out.println(tri1.getArea());
        System.out.println(tri1.getPrimeter());
        Triagle tri2 = new Triagle(0,0,0);
        Triagle tri3 = new Triagle(4,3,5);
        System.out.println(tri3);
        System.out.println(tri3.getArea());
        System.out.println(tri3.getPrimeter());
    }
}

package ExerciseofPointandMovable;


public class Point {
    private float x;
    private float y;

    public Point() {
        x = 0.0f;
        y = 0.0f;
    }

    public Point(float _x, float _y) {
        x = _x;
        y = _y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] arr = new float[2];
        arr[0] = x;
        arr[1] = y;
        return arr;
    }

    public String toString() {
        return "A point of x is: " + x +
                " y is: " + y;
    }

    public static void main(String[] args) {
        Point point1 = new Point();
        Point point2 = new Point(1.0f, 2.0f);
        System.out.println(point2);
        System.out.println(point1);
    }
}

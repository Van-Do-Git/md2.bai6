package ExerciseofPoint2D3D;

public class Point3D extends Point2D {
    private float z;

    public Point3D() {
        super();
        z = 1.0f;
    }

    public Point3D(float _x, float _y, float _z) {
        super(_x, _y);
        z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        float[] arr = new float[3];
        arr[0] = getX();
        arr[1] = getY();
        arr[2] = z;
        return arr;
    }

    public void setXYZ(float _x, float _y, float _z) {
        super.setXY(_x, _y);
        z = _z;
    }

    public String toString() {
        return super.toString() + " z is: " + z;
    }

    public static void main(String[] args) {
        Point3D p1 = new Point3D();
        Point3D p2 = new Point3D(2.0f, 3.0f, 5.0f);
        System.out.println(p1);
        System.out.println(p2);
    }
}

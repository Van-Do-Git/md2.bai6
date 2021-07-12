package ExerciseofPointandMovable;


public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    MovablePoint() {
        xSpeed = 0.0f;
        ySpeed = 0.0f;
    }

    MovablePoint(float _xSpeed, float _ySpeed) {
        xSpeed = _xSpeed;
        ySpeed = _ySpeed;
    }

    MovablePoint(float _x, float _y, float _xSpeed, float _ySpeed) {
        super(_x, _y);
        xSpeed = _xSpeed;
        ySpeed = _ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float _xSpeed, float _ySpeed) {
        xSpeed = _xSpeed;
        ySpeed = _ySpeed;
    }

    public float[] getSpeed() {
        float[] arr = new float[2];
        arr[0] = getxSpeed();
        arr[1] = getySpeed();
        return arr;
    }

    public String toString() {
        return super.toString() +
                " Xspeed is = " + getxSpeed() +
                " Yspeed is = " + getySpeed();
    }

    public float[] move() {
        setXY(getX() + getxSpeed(), getY() + getySpeed());
        float[] arr = new float[4];
        arr[0] = getX();
        arr[1] = getY();
        arr[2] = getxSpeed();
        arr[3] = getX();
        return arr;
    }

    public static void main(String[] args) {
        MovablePoint move1 = new MovablePoint();
        System.out.println(move1);
        MovablePoint move2 = new MovablePoint(0.0f, 0.0f, 2.0f,2.0f);
        System.out.println(move2);
        move2.move();
        move2.move();
        System.out.println(move2);
    }
}

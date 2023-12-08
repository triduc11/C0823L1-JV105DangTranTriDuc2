package bai_3_lop_point_va_moveablePoint;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint() {

    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] Speed = new float[2];
        Speed[0] = getXSpeed();
        Speed[1] = getYSpeed();
        return Speed;
    }

    public MoveablePoint move() {
        setXY(getX() + getXSpeed(), getY() + getYSpeed());
        return this;
    }

    @Override
    public String toString() {
        return "MoveablePoint " +
                "Speed={" + xSpeed + "," + ySpeed + "} " +
                "(x,y)={" + getX() + "," + getY() + "}";
    }
}

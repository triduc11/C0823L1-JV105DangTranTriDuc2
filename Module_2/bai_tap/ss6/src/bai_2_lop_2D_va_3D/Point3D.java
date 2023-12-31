package bai_2_lop_2D_va_3D;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        float[] xyz = new float[3];
        xyz[0] = super.getX();
        xyz[1] = super.getY();
        xyz[2] = z;
        return xyz ;
    }
    public void setXYZ (float x,float y,float z){
        super.setX(x);
        super.setY(y);
        setZ(z);
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", z=" + z +
                '}';
    }
}

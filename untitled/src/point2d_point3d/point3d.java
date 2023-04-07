package point2d_point3d;

public class point3d extends point2d{
    private float z = 0.0f;

    public point3d() {
    }

    public point3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] arr = new float[3];
        arr[0] = getX();
        arr[1] = getY();
        arr[2] = z;
        return arr;
    }

    @Override
    public String toString() {
        return "Point3D: " + "(" + getX() + " , " + getY() + " , " + getZ() + ")";
    }

}

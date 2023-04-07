package point2d_point3d;

public class point2d {
    private float x = 0.0f;
    private float y = 0.0f;

    public point2d() {
    }

    public point2d(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
        float[] arr = new float[2];
        arr[0] = x;
        arr[1] = y;
        return arr;
    }
    @Override
    public String toString() {
        return "Point2D: " + "(" + getX() + " , " + getY() + ")";
    }

}

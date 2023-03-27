public class Fan {
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    public Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
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

    public String toString() {
        if (on) {
            return "speed: " + speed + ", color: " + color + ", radius: " + radius + ". fan is on";
        } else {
            return "color: " + color + ", radius: " + radius + ". fan is off";
        }
    }
}



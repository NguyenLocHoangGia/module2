import java.awt.*;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public QuadraticEquation(){
    }
    public QuadraticEquation(double a, double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    public double getDelta(){
        return Math.pow(b,2) - 4 * a * c;
    }
    public double getN1(){
        if (getDelta()>=0){
            return (-b + Math.pow(getDelta(),0.5))/(2*a);
        }else {
            return 0;
        }
    }
    public double getN2(){
        if (getDelta()>=0){
            return (-b + Math.pow(getDelta(),0.5))/(2*a);
        }else {
            return 0;
        }
    }
}

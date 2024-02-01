//นพกรณ์ สงเคราะห์
//6609540023
import java.lang.Math;
public class Ball {
    private double radius;//declare variables
    public void setRadius(double aRadius){
        radius = aRadius;
    }
    
    public double getRadius(){
        return radius;
    }

    public double getSurface(){
        return 4*Math.PI*Math.pow(radius,2);
    }

    public double getVolume(){
        return 4.00/3.00*Math.PI*Math.pow(radius,3);
    }
}
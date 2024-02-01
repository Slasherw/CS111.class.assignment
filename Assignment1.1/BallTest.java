//นพกรณ์ สงเคราะห์
//6609540023
import java.util.Scanner;
public class BallTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the radius of the ball > ");
        double radius = input.nextDouble();
        
        Ball cal = new Ball();
        cal.setRadius(radius);
        System.out.printf("The ball radius '%.2f' has surface area=%.3f The ball\nradius '%.2f' has volume =%.3f",cal.getRadius(),cal.getSurface(),cal.getRadius(),cal.getVolume());
        
        input.close();
    }
}

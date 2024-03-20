//นพกรณ์ สงเคราะห์
//6609540023
import java.util.Scanner;
import java.lang.Math;
public class PhoneBill {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter minutes: ");
        double time = input.nextDouble();
        double minute = Math.ceil(time);
        if(minute < 0){
            System.out.println("You have to pay "+ minute);
        }
        
        if(minute < 10){
            System.out.printf("You have to pay "+ minute*3.50);
        }
        
        if(minute > 10 && minute < 60){
            if(minute <= 20){
                
            }
        }
    }
}

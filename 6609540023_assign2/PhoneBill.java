//นพกรณ์ สงเคราะห์
//6609540023
import java.util.Scanner;
import java.lang.Math;
public class PhoneBill {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean i ;
        while ( i = true) {
            System.out.print("Enter minutes (Q = Quit): ");
            String time = input.nextLine();
            double timeChange = Double.parseDouble(time);
            double minute = Math.ceil(timeChange);
            if(minute <= 0){
                System.out.println("You have to pay 0.0");
            }
        
            if(minute > 0 && minute < 10){
                System.out.printf("You have to pay "+ minute*3.50 + "\n");
            }
        
            if(minute >= 10 && minute < 60){
                if(minute <= 20){
                    System.out.printf("You have to pay "+ minute*3 + "\n");
                }

                if(minute > 20 && minute < 60){
                    System.out.printf("You have to pay " + ((20*3) + ((minute - 20)*1)) + "\n");
                }
            }

            if(minute >= 60){
                System.out.printf("You have to pay " + (minute * 1.5) + "\n");
            }

            if(time == "Q"){
                i=false;
                
            }
        }input.close();
    }
}

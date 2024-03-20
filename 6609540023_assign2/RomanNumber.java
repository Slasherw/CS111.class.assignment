//นพกรณ์ สงเคราะห์
//6609540023
import java.util.Scanner;

public class RomanNumber {

    public static String setInput(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input the roman number: ");
        String roman = input.nextLine();
        return roman;
    }

    public static void switchRomanToNumbers(String roman){
        switch(roman){
            case "I":
                System.out.println("It is One.");
                break;

            case "II":
                System.out.println("It is Two.");
                break;

            case "III":
                System.out.println("It is Three.");
                break;

            case "IV":
                System.out.println("It is Four.");
                break;

            case "V":
                System.out.println("It is Five.");
                break;

            case "VI":
                System.out.println("It is Six.");
                break;
            
            default:
                System.out.println("Unknown Number.");
        }
    }

    public static void main(String[] args) {
        for(int i=1;i>0;i++){
            switchRomanToNumbers(setInput());
        }
        
    }
}

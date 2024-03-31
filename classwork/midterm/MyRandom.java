package midterm;
import java.util.Scanner;
import java.util.Random;
public class MyRandom {

    public static int genRandom(int min,int max){
        Random number = new Random();
        int z;
        int k = -1;
        if(min > max){
            z = min;
            min = max;
            max = z;
        }
        if(max < min){
            z= max;
            max=min;
            min = z;
        }
        if(min < 0 || max < 0){
            System.out.println("error range cannot be negative value");
            return k;
        } else if(min>=0 && max <=2567){
            int i = number.nextInt(min,max+1);
            return i;
        }else return k;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min,max,random;
        String choice="Y";
        do {
            System.out.print("Please enter min: ");
        min = input.nextInt();
        System.out.print("\nPlease enter max: ");
        max = input.nextInt();

        random = genRandom(min, max);
        if(random != -1){
            System.out.println("Value after Random (Min "+ min +", Max: "+ max +") = "+random);
        }
        if(random == -1){
            System.out.println("Invalid Condition, Value after Random (Min: "+min+", Max: "+ max +")= "+ random);
        }
        System.out.print("Press Y to Continue, Q to Exit: ");
        input.nextLine();
        String exit = input.nextLine();
        if(exit!="Y"){
            choice = "Q";
        }else choice="Y";
        } while (choice.equals("Y"));
        
        input.close();
    }
}

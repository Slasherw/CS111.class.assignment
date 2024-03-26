import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayListRandomNum {
    //private ArrayList<Integer> arr1;

    public ArrayListRandomNum(){
        //arr1 = new ArrayList<Integer>(); 
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr1;
        arr1 = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        Random number = new Random();
        for(int i=0;i<x;i++){
            arr1.add(number.nextInt(101));//Auto Boxing
        }

        int sum=0;
        for (Integer y : arr1) {
            sum+=y;//y.intValue(); Auto unboxing
        }
       
    }
}

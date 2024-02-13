//นพกรณ์ สงเคราะห์
//6609540023
import java.util.Scanner;
public class FourWordsTest {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        FourWords words4 = new FourWords();
        words4.printWords();
        for(int i=1;i<=5;i++){
            System.out.print("Enter your word: ");
            String word =input.nextLine();
            words4.add(word);
            System.out.print("Round "+i+" :");
            words4.printWords();
        }
        input.close();
    }
}
//นพกรณ์ สงเคราะห์
//6609540023
package 6609540023_assign3.Bread;
import java.util.ArrayList;
interface Toastable{
    void toast();
    void getToastState();
}

public class Toaster{
    private ArrayList<Toastable> item;

    //create toaster
    public Toaster(){
        item = new ArrayList<>();
    }

    public void add(Toastable item){
        //add new toastable item
        
    }

    public void print(){
        //print out all the item in the toaster

    }
}

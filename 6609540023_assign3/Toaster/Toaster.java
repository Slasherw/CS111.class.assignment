//นพกรณ์ สงเคราะห์
//6609540023
package 6609540023_assign3.Toaster;
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
        item.add(item);
    }

    public void print(){
        //print out all the item in the toaster
        for (Toastable toastable : item) {
            System.out.println(item.getToastState());
        }
    }
}

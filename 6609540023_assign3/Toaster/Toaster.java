//นพกรณ์ สงเคราะห์
//6609540023
import java.util.ArrayList;
interface Toastable{
    void toast();
    void getToastState();
}

public class Toaster{
    private ArrayList<Toastable> items;

    public Toaster(){
        items = new ArrayList<>();
    }

    public void add(Toastable item){
        items.add(item);
    }

    public void print(){
        for (int i =0;i < items.size();i++) {
            System.out.println((i+1)+"."+ items.get(i));
        }
    }
}

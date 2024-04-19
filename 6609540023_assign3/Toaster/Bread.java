//นพกรณ์ สงเคราะห์
//6609540023
package 6609540023_assign3.Toaster;

public class Bread implements Toastable {
    public static final String BURNT="Burn";
    public static final String CRISP="Crisp";
    public static final String SOFT="Soft";
    private String state;

    public void toast(){
        System.out.println("Bread is toasing");
        if(state == SOFT){
            state == CRISP;
        }
        if(state == CRISP){
            state == BURNT;
        }
    }

    public void getToastState(){
        System.out.println(state);
    }

    //create bread
    public Bread(){
        state = SOFT;
    }

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public String toString(){
        return "Bread is now: "+ state;
    }
}

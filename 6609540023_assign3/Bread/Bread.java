//นพกรณ์ สงเคราะห์
//6609540023
package 6609540023_assign3.Bread;

public class Bread implements Toastable {
    public static final String BURNT="Burn";
    public static final String CRISP="Crisp";
    public static final String SOFT="Soft";
    private String state;

    public void toast(){
        Toastable bread = new Toastable();
        bread.setState(CRISP)
    }

    public void getToastState(){
        
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

public class ChaMovement {//Object
    private String name;//Attribute, Instance Varibles(เรียกใช้ได้ทุก Methods)
    //private int score = 0, positionX = 0, positionY = 0;//Attribute//non-constructor//bad,waste of memory
    private int score,positionX,positionY;/*Attribute,Instance Variables */

    public ChaMovement(){//Constructor Method (Same as class name,no return type)
        //default constructor methods => ChaMovement p1 = new ChaMovement();
        score = 0;
        positionX = 0;
        positionY = 0;
    }
 
    /* overload constructor => ChaMovement p2 = new ChaMovement("TheTop",100,1920,1080);*/
    public ChaMovement(String name1, int score1, int x, int y ){
        name=name1;
        score=score1;
        positionX=x;
        positionY=y;
    }

    public void move(int horizontalDistance, int verticalDistance) {
        positionX+=horizontalDistance;//positionX = positionX + horizontalDistance;
        positionY+=verticalDistance;//positionY = positionY + verticalDistance;
        score+=5;//score = score + 5;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;//"this"=Instance Variables,"name = Parameter"
    }
    public void showInfo() {
        System.out.println("My name is:"+ name+" My position is at x:"+ positionX +" and y:"+ positionY +"score:"+score);
    }
}

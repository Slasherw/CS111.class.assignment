/**
* Person class show the position and score of a person
* @author TheTop
* @version 1.0
* @since 2024-01-24
*
*/
public class Person  {
    /**
    * name This variable contain the name of a person
    */
    private String name ;
    
    /**
    * score This variable contain the score of the person
    */
    private int score ;

    /**
    * positionX This variable contain the position of a person in horizontal direction
    */
    private int positionX ;

    /**
    * positionY This variable contain the position of a person in vertical direction
    */
    private int positionY ;
    
    //Default constructor
    /**
    * This is the method thats set the default value to the
    * person       
    */
    public Person(){
        name = "undefined" ;	
        score = 0 ;
        positionX = 0 ; 
        positionY = 0 ;
    }
    
    /**
    * This method is used to change the position of
    * the person,by adding the distance in horizontal
    * and vertical ways and its change the score by adding 5
    * point to the score as well as the position changed
    * @param horizantalDistance the distance thats the person 
    * move in horizontal direction
    * @param verticalDistance the distance thats the person 
    * move in vertical direction
    */
    public void move(int horizantalDistance, int verticalDistance){
        positionX = positionX + horizantalDistance;
        positionY = positionY + verticalDistance;
        score = score + 5;
    }
    
    /**
    * This method used to get the name of the person
    * @return name of the person
    */
    public String getName(){
        return name;
    }

    /**
    * This method used to set the name to the person
    * @param name name of the person
    */
    public void setName(String name) {
        this.name = name ;
    } 
    
    /**
    * This method used to set the score to the person
    * @param score score of the person
    */
    public void setScore(int score){
        this.score = score ;    
    }
    
    /**
    * This method used to show the position and
    * the score of the person
    */
    public void showInfo() {
        System.out.println("My postion is at x: " + positionX +
            " and y: " + positionY + " score: " + score);
    }
    
}



public class Student {
    //ประกาศคุณสมบัติของ Student:=ชื่อ-นามสกุล GPA ID
    private String name ;
    private float gpa ;
    
    //ประกาศความสามารถที่ Student ทำได้: setname(), getGrade(), getName(), setGrade
    
    //modifier return-type method-name(parameters){body}
    public void setName(String s){
        name = s;
    }
    
    public String getName() {
        return name;
    }
    
    public float getGrade() {
        return gpa;
    }
    
    public void setGrade(float g1){
        gpa = g1;
    }
    
    public static void main(String args[]){
        System.out.println("Hello world");
        
        //Struct Student s1 ; s1.name = "TheTop"; c language 
        Student s1;
        s1 = new Student() ; //new ใช้เพื่อจองพื้นที่ในmemory
        s1.setName("Mr.1");
        //String name = s1.getName();
        System.out.println(s1.getName());
        
        Student s2;
        s2 = new Student();
        s2.setName("Noppakron");
        s2.setGrade(3.00f);
        System.out.print(s2.getName()+" ");
        System.out.print(s2.getGrade());
    }
}